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
        val expectedCounts = mapOf(76 to 14, 77 to 8, 78 to 17, 79 to 6, 80 to 8)
        expectedCounts.forEach { (chapterNumber, expectedCount) ->
            val chapter = EnocContent.chapters.first { it.number == chapterNumber }
            assertEquals(expectedCount, chapter.verses.size)
            assertEquals((1..expectedCount).map { "$chapterNumber:$it" }, chapter.verses.map { it.reference })
        }
    }

}
