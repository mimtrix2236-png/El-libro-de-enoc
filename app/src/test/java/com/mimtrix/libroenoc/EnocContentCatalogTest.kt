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

}
