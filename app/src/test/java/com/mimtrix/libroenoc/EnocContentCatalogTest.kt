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
    fun chapters66To108RemainMarkedAsProvisionalParaphrases() {
        EnocContent.chapters.filter { it.number in 66..108 }.forEach { chapter ->
            assertTrue("Chapter ${chapter.number} lost its provisional status", chapter.status.contains("Paráfrasis provisional"))
        }
    }
}
