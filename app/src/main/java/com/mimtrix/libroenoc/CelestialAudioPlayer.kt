package com.mimtrix.libroenoc

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import kotlin.math.PI
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.sin

/**
 * Original procedural ambient pad. Synthesized sine tones only: no samples,
 * downloads, APIs, or external media assets.
 */
class CelestialAudioPlayer {
    @Volatile private var running = false
    @Volatile private var desiredPlay = false
    @Volatile private var volume = 0.18f
    private var audioTrack: AudioTrack? = null
    private var worker: Thread? = null

    @Synchronized
    fun start(requestedVolume: Float) {
        desiredPlay = true
        volume = requestedVolume.coerceIn(0f, 0.35f)
        if (running) {
            audioTrack?.setVolume(volume)
            return
        }
        startLoop()
    }

    @Synchronized
    fun pause() {
        if (desiredPlay) stopLoop()
    }

    @Synchronized
    fun resume() {
        if (desiredPlay && !running) startLoop()
    }

    @Synchronized
    fun stop() {
        desiredPlay = false
        stopLoop()
    }

    private fun startLoop() {
        if (running) return
        val minimum = AudioTrack.getMinBufferSize(
            SAMPLE_RATE,
            AudioFormat.CHANNEL_OUT_MONO,
            AudioFormat.ENCODING_PCM_16BIT
        )
        val bufferBytes = max(minimum * 2, CHUNK_SIZE * 2)
        val created = AudioTrack.Builder()
            .setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build()
            )
            .setAudioFormat(
                AudioFormat.Builder()
                    .setSampleRate(SAMPLE_RATE)
                    .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                    .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                    .build()
            )
            .setBufferSizeInBytes(bufferBytes)
            .setTransferMode(AudioTrack.MODE_STREAM)
            .build()
        if (created.state != AudioTrack.STATE_INITIALIZED) {
            created.release()
            return
        }
        created.setVolume(volume)
        audioTrack = created
        running = true
        created.play()
        worker = Thread({ render(created) }, "EnocCelestialAmbience").apply {
            isDaemon = true
            start()
        }
    }

    private fun render(track: AudioTrack) {
        var sampleIndex = 0L
        val buffer = ShortArray(CHUNK_SIZE)
        try {
            while (running) {
                fill(buffer, sampleIndex, 1f)
                val written = track.write(buffer, 0, buffer.size, AudioTrack.WRITE_BLOCKING)
                if (written > 0) sampleIndex += written
                if (written < 0) break
            }
            // Gentle 350 ms release when sound is switched off or the Activity stops.
            val tailFrames = SAMPLE_RATE / 3
            var remaining = tailFrames
            while (remaining > 0 && track.playState == AudioTrack.PLAYSTATE_PLAYING) {
                val count = minOf(buffer.size, remaining)
                for (i in 0 until count) {
                    val fade = remaining.toFloat() / tailFrames
                    buffer[i] = synth(sampleIndex++, fade)
                    remaining--
                }
                val written = track.write(buffer, 0, count, AudioTrack.WRITE_BLOCKING)
                if (written < 0) break
            }
        } catch (_: InterruptedException) {
            Thread.currentThread().interrupt()
        } catch (_: IllegalStateException) {
            // The track may be stopped during Activity teardown.
        }
    }

    private fun fill(buffer: ShortArray, start: Long, fade: Float) {
        for (i in buffer.indices) buffer[i] = synth(start + i, fade)
    }

    private fun synth(index: Long, release: Float): Short {
        val t = index.toDouble() / SAMPLE_RATE
        val cycle = t % CHORD_SECONDS
        val chordIndex = floor(t / CHORD_SECONDS).toInt() % CHORDS.size
        val nextIndex = (chordIndex + 1) % CHORDS.size
        val transition = smooth(((cycle - (CHORD_SECONDS - CROSSFADE_SECONDS)) / CROSSFADE_SECONDS).toFloat())
        val current = chord(CHORDS[chordIndex], t)
        val next = chord(CHORDS[nextIndex], t)
        val fadeIn = minOf(1f, (t / 3.0).toFloat())
        val breathe = 0.82f + 0.18f * sin(t * 0.11).toFloat()
        val sample = (current * (1f - transition) + next * transition) *
            fadeIn * breathe * release * volume * MASTER_GAIN
        return (sample.coerceIn(-1f, 1f) * Short.MAX_VALUE).toInt().toShort()
    }

    private fun chord(frequencies: FloatArray, time: Double): Float {
        var sum = 0.0
        for (frequency in frequencies) {
            val phase = 2.0 * PI * frequency * time
            sum += sin(phase) + 0.18 * sin(phase * 2.0)
        }
        return (sum / (frequencies.size * 1.18)).toFloat()
    }

    private fun smooth(value: Float): Float {
        val x = value.coerceIn(0f, 1f)
        return x * x * (3f - 2f * x)
    }

    @Synchronized
    private fun stopLoop() {
        running = false
        val localWorker = worker
        if (localWorker != null && localWorker !== Thread.currentThread()) {
            try {
                localWorker.join(500)
            } catch (_: InterruptedException) {
                Thread.currentThread().interrupt()
            }
            if (localWorker.isAlive) localWorker.interrupt()
        }
        val localTrack = audioTrack
        if (localTrack != null) {
            try {
                if (localTrack.playState == AudioTrack.PLAYSTATE_PLAYING) localTrack.stop()
            } catch (_: IllegalStateException) {}
            try {
                localTrack.release()
            } catch (_: IllegalStateException) {}
        }
        audioTrack = null
        worker = null
    }

    private companion object {
        const val SAMPLE_RATE = 22_050
        const val CHUNK_SIZE = 2_048
        const val CHORD_SECONDS = 32.0
        const val CROSSFADE_SECONDS = 4.0
        const val MASTER_GAIN = 0.035f
        val CHORDS = arrayOf(
            floatArrayOf(130.81f, 261.63f, 392.00f, 523.25f), // C
            floatArrayOf(174.61f, 261.63f, 349.23f, 523.25f), // F
            floatArrayOf(110.00f, 220.00f, 329.63f, 440.00f), // Am
            floatArrayOf(146.83f, 196.00f, 293.66f, 392.00f)  // G
        )
    }
}
