package com.mimtrix.libroenoc

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class EnocContentCatalogTest {
    @Test
    fun catalogContainsAll108ChaptersInOrder() {
        assertEquals(108, EnocContent.chapters.size)
        assertEquals((1..108).toList(), EnocContent.chapters.map { it.number })
    }

    @Test
    fun everyChapterHasTitleAndReadingText() {
        EnocContent.chapters.forEach { chapter ->
            assertTrue("Chapter ${chapter.number} has an empty title", chapter.title.isNotBlank())
            assertTrue("Chapter ${chapter.number} has no reading text", chapter.verses.isNotEmpty())
            assertTrue("Chapter ${chapter.number} contains a blank reading unit", chapter.verses.all { it.text.isNotBlank() })
        }
    }

    @Test
    fun chapter66TranslationIsMarkedIndirectAndLaterDraftsRemainProvisional() {
        val chapter66 = EnocContent.chapters.first { it.number == 66 }
        assertTrue(chapter66.status.contains("Traducción de trabajo indirecta"))
        EnocContent.chapters.filter { it.number in 67..108 }.forEach { chapter ->
            assertTrue("Chapter ${chapter.number} lost its provisional status", chapter.status.contains("Paráfrasis provisional"))
        }
    }
    @Test
    fun chapters76To78ContainVerseLevelParaphrases() {
        val expectedCounts = mapOf(76 to 14, 77 to 8, 78 to 17, 79 to 6, 80 to 8, 81 to 10, 82 to 20, 83 to 11, 84 to 6, 85 to 10, 86 to 6, 87 to 4, 88 to 3)
        expectedCounts.forEach { (chapterNumber, expectedCount) ->
            val chapter = EnocContent.chapters.first { it.number == chapterNumber }
            assertEquals(expectedCount, chapter.verses.size)
            assertEquals((1..expectedCount).map { "$chapterNumber:$it" }, chapter.verses.map { it.reference })
        }
    }

    @Test
    fun chapter89NarrativeUnitsPreserveOrderedRanges() {
        val expected = listOf("89:1–9", "89:10–13", "89:14–17", "89:18–22", "89:23–27", "89:28–34", "89:35–40", "89:41–49", "89:50–54", "89:55–58", "89:59–64", "89:65–71", "89:72–77")
        val chapter = EnocContent.chapters.first { it.number == 89 }
        assertEquals(expected, chapter.verses.map { it.reference })
    }

    @Test
    fun chapter90NarrativeUnitsPreserveOrderedRanges() {
        val expected = listOf("90:1–5", "90:6–12", "90:13–19", "90:20–27", "90:28–36", "90:37–42")
        val chapter = EnocContent.chapters.first { it.number == 90 }
        assertEquals(expected, chapter.verses.map { it.reference })
    }

    @Test
    fun chapters106to108UseUpdatedRangeSummariesAndSourceCaveats() {
        val chapter106 = EnocContent.chapters.first { it.number == 106 }
        val chapter107 = EnocContent.chapters.first { it.number == 107 }
        val chapter108 = EnocContent.chapters.first { it.number == 108 }

        assertEquals(
            listOf("106:1", "106:2", "106:3", "106:4", "106:5", "106:6", "106:7", "106:8", "106:9", "106:10", "106:11", "106:12", "106:13", "106:14", "106:17", "106:15", "106:16", "106:18", "106:19"),
            chapter106.verses.map { it.reference }
        )
        assertTrue(chapter106.criticalNote.contains("106:1–2"))
        assertTrue(chapter106.criticalNote.contains("106:13–107:2"))
        assertTrue(chapter106.criticalNote.contains("106:17"))
        assertTrue(chapter106.criticalNote.contains("106:16"))
        assertTrue(chapter106.verses[14].reference == "106:17")
        assertEquals(listOf("107:1", "107:2", "107:3"), chapter107.verses.map { it.reference })
        assertEquals((1..15).map { "108:$it" }, chapter108.verses.map { it.reference })

        assertTrue(chapter106.criticalNote.contains("4Q204"))
        assertTrue(chapter106.criticalNote.contains("no cotejo directo"))
        assertTrue(chapter106.editorialNote.contains("chapter_106_generated.svg"))
        assertTrue(chapter107.verses.last().text.contains("Noé"))
        assertTrue(chapter108.criticalNote.contains("Ge'ez"))
        assertTrue(chapter108.criticalNote.contains("look over"))
        assertTrue(chapter108.criticalNote.contains("No se cotejó Ge'ez directamente"))
        assertTrue(chapter108.verses.last().text.contains("resplandor"))
    }


    @Test
    fun chapters97And98KeepVerseUnitsAndWitnessCaveats() {
        val chapter97 = EnocContent.chapters.first { it.number == 97 }
        val chapter98 = EnocContent.chapters.first { it.number == 98 }

        assertEquals(
            listOf("97:1", "97:2", "97:3", "97:4", "97:5", "97:6", "97:7", "97:8a", "97:8b", "97:9a–9c", "97:9d", "97:9e", "97:10"),
            chapter97.verses.map { it.reference }
        )
        assertTrue(chapter97.criticalNote.contains("97:9d–e"))
        assertTrue(chapter97.criticalNote.contains("97:8a"))

        assertEquals((1..16).map { "98:$it" }, chapter98.verses.map { it.reference })
        assertTrue(chapter98.criticalNote.contains("98:3b–4a"))
        assertTrue(chapter98.criticalNote.contains("98:11b–12a"))
        assertTrue(chapter98.criticalNote.contains("98:15"))
    }
    @Test
    fun chapter108HasFifteenVerseUnitsAndRecordsItsGeEzOnlyStatusAndDamagedReading() {
        val chapter108 = EnocContent.chapters.first { it.number == 108 }
        assertEquals((1..15).map { "108:$it" }, chapter108.verses.map { it.reference })
        assertTrue(chapter108.status.contains("Paráfrasis provisional"))
        assertTrue(chapter108.criticalNote.contains("Ge'ez"))
        assertTrue(chapter108.criticalNote.contains("look over"))
        assertTrue(chapter108.criticalNote.contains("No se cotejó Ge'ez directamente"))
        assertTrue(chapter108.criticalNote.contains("chapter_108.svg"))
        assertTrue(chapter108.verses[10].text.contains("generación de luz"))
    }

    @Test
    fun chapter99UsesSixteenVerseLevelParaphrasesAndTextualCaveats() {
        val chapter99 = EnocContent.chapters.first { it.number == 99 }
        assertEquals((1..16).map { "99:$it" }, chapter99.verses.map { it.reference })
        assertTrue(chapter99.status.contains("Paráfrasis provisional"))
        assertTrue(chapter99.criticalNote.contains("99:11–12"))
        assertTrue(chapter99.criticalNote.contains("no conserva"))
        assertTrue(chapter99.criticalNote.contains("ley eterna"))
        assertTrue(chapter99.criticalNote.contains("chapter_99.svg"))
    }

    @Test
    fun chapter100HasThirteenVerseLevelParaphrasesAndWitnessLimits() {
        val chapter100 = EnocContent.chapters.first { it.number == 100 }
        assertEquals((1..13).map { "100:$it" }, chapter100.verses.map { it.reference })
        assertTrue(chapter100.status.contains("Paráfrasis provisional"))
        assertTrue(chapter100.criticalNote.contains("97:6–104:13"))
        assertTrue(chapter100.criticalNote.contains("No se inspeccionaron"))
        assertTrue(chapter100.criticalNote.contains("chapter_100.svg"))
    }
    @Test
    fun chapter101HasNineVerseUnitsAndSeaWitnessCaveats() {
        val chapter101 = EnocContent.chapters.first { it.number == 101 }
        assertEquals((1..9).map { "101:$it" }, chapter101.verses.map { it.reference })
        assertTrue(chapter101.status.contains("Paráfrasis provisional"))
        assertTrue(chapter101.criticalNote.contains("97:6–104:13"))
        assertTrue(chapter101.criticalNote.contains("No se inspeccionaron"))
        assertTrue(chapter101.criticalNote.contains("chapter_101.svg"))
    }

    @Test
    fun chapter102HasElevenVerseUnitsAndPreservesTextualCaveats() {
        val chapter102 = EnocContent.chapters.first { it.number == 102 }
        assertEquals((1..11).map { "102:$it" }, chapter102.verses.map { it.reference })
        assertTrue(chapter102.status.contains("Paráfrasis provisional"))
        assertTrue(chapter102.criticalNote.contains("102:3"))
        assertTrue(chapter102.criticalNote.contains("Sheol"))
        assertTrue(chapter102.criticalNote.contains("102:8"))
        assertTrue(chapter102.criticalNote.contains("chapter_102.svg"))
        assertTrue(chapter102.verses[7].text.contains("forma griega"))
    }

    @Test
    fun chapter104HasThirteenVerseUnitsAndRecordsPartialWitnessCoverage() {
        val chapter104 = EnocContent.chapters.first { it.number == 104 }
        assertEquals((1..13).map { "104:$it" }, chapter104.verses.map { it.reference })
        assertTrue(chapter104.status.contains("Paráfrasis provisional"))
        assertTrue(chapter104.criticalNote.contains("97:6–104:13"))
        assertTrue(chapter104.criticalNote.contains("104:13–105:2"))
        assertTrue(chapter104.criticalNote.contains("no se inspeccionaron"))
        assertTrue(chapter104.criticalNote.contains("chapter_104.svg"))
        assertTrue(chapter104.verses[10].text.contains("relación exacta"))
    }

    @Test
    fun chapter105HasTwoVersesAndRecordsTheAramaicWitnessAndSuppliedWords() {
        val chapter105 = EnocContent.chapters.first { it.number == 105 }
        assertEquals(listOf("105:1", "105:2"), chapter105.verses.map { it.reference })
        assertTrue("Chapter 105 must remain provisional", chapter105.status.contains("Paráfrasis provisional"))
        assertTrue("Chapter 105 must record 4Q204", chapter105.criticalNote.contains("4Q204"))
        assertTrue("Chapter 105 must record the assigned range", chapter105.criticalNote.contains("104:13–105:2"))
        assertTrue("Chapter 105 must preserve the phrase under editorial review", chapter105.verses[1].text.contains("mi Hijo"))
    }

    @Test
    fun chapter103HasFifteenVerseUnitsAndRecordsWitnessGaps() {
        val chapter103 = EnocContent.chapters.first { it.number == 103 }
        assertEquals((1..15).map { "103:$it" }, chapter103.verses.map { it.reference })
        assertTrue(chapter103.status.contains("Paráfrasis provisional"))
        assertTrue(chapter103.criticalNote.contains("103:10"))
        assertTrue(chapter103.criticalNote.contains("103:12"))
        assertTrue(chapter103.criticalNote.contains("Stuckenbruck"))
        assertTrue(chapter103.criticalNote.contains("chapter_103.svg"))
        assertTrue(chapter103.verses[10].text.contains("yugo"))
    }
}
