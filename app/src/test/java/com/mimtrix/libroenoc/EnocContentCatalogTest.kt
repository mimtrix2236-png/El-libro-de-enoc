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

        assertEquals(listOf("106:1–3", "106:4–7", "106:8–12", "106:13–19"), chapter106.verses.map { it.reference })
        assertEquals(listOf("107:1", "107:2", "107:3"), chapter107.verses.map { it.reference })
        assertEquals(listOf("108:1–3", "108:4–6", "108:7–10", "108:11–15"), chapter108.verses.map { it.reference })

        assertTrue(chapter106.criticalNote.contains("4Q204"))
        assertTrue(chapter106.criticalNote.contains("no cotejo directo"))
        assertTrue(chapter106.editorialNote.contains("chapter_106_generated.svg"))
        assertTrue(chapter107.verses.last().text.contains("Noé"))
        assertTrue(chapter108.criticalNote.contains("Ge'ez"))
        assertTrue(chapter108.criticalNote.contains("No se cotejó Ge'ez directamente"))
        assertTrue(chapter108.verses.last().text.contains("resplandecerán"))
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
}
