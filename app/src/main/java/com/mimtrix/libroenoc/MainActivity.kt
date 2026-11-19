package com.mimtrix.libroenoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Parchment = Color(0xFFF1E5CB)
private val Ink = Color(0xFF2D2130)
private val Gold = Color(0xFFC69A45)
private val Wine = Color(0xFF6B2835)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { EnocReader() }
    }
}

@Composable
private fun EnocReader() {
    var selectedChapter by remember { mutableIntStateOf(1) }
    var showIndex by remember { mutableStateOf(true) }
    var fontScale by remember { mutableFloatStateOf(1f) }
    var night by remember { mutableStateOf(false) }
    val bg = if (night) Color(0xFF19151B) else Parchment
    val paper = if (night) Color(0xFF302832) else Color(0xFFFBF6EA)
    val text = if (night) Parchment else Ink
    val selected = EnocContent.chapters.firstOrNull { it.number == selectedChapter }
    val chapterArt = when (selectedChapter) {
        6 -> R.drawable.watchers_06
        7 -> R.drawable.giants_07
        8 -> R.drawable.forbidden_08
        9 -> R.drawable.archangels_09
        10 -> R.drawable.judgment_10
        11 -> R.drawable.blessing_11
        12 -> R.drawable.enoch_hidden_12
        13 -> R.drawable.petition_13
        14 -> R.drawable.heavenly_house_14
        15 -> R.drawable.spirits_15
        16 -> R.drawable.final_sentence_16
        17 -> R.drawable.journey_17
        else -> R.drawable.enoch_illumination_banner
    }
    val lastAvailableChapter = EnocContent.chapters.maxOfOrNull { it.number } ?: 1

    MaterialTheme {
        Surface(Modifier.fillMaxSize(), color = bg) {
            Column(Modifier.fillMaxSize()) {
                Column(
                    Modifier.fillMaxWidth().background(
                        Brush.verticalGradient(listOf(Color(0xFF3A263C), Color(0xFF171522)))
                    ).padding(horizontal = 22.dp, vertical = 22.dp)
                ) {
                    Text("EDICIÓN ILUSTRADA", color = Gold, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)
                    Spacer(Modifier.height(7.dp))
                    Image(painterResource(R.drawable.enoch_illumination_banner), contentDescription = "Ilustración ornamental inspirada en manuscritos etiópicos", modifier = Modifier.fillMaxWidth().height(112.dp))
                    Spacer(Modifier.height(8.dp))
                    Text("El Libro de Enoc", color = Parchment, fontSize = 27.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                    Text("Lectura · manuscritos · variantes críticas", color = Color(0xFFD9CBAF), fontSize = 12.sp)
                }
                Row(Modifier.fillMaxWidth().padding(horizontal = 14.dp, vertical = 10.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text(if (showIndex) "ÍNDICE DE CAPÍTULOS" else "CAPÍTULO $selectedChapter", color = text, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                    Spacer(Modifier.weight(1f))
                    TextButton(onClick = { showIndex = !showIndex }) { Text(if (showIndex) "Abrir lectura" else "Ver índice", color = Wine) }
                }
                if (showIndex) {
                    LazyColumn(
                        Modifier.weight(1f),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp),
                        verticalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        items(EnocContent.chapters) { chapter ->
                            Card(
                                Modifier.fillMaxWidth().clickable { selectedChapter = chapter.number; showIndex = false },
                                shape = RoundedCornerShape(12.dp),
                                colors = CardDefaults.cardColors(containerColor = if (selectedChapter == chapter.number) Color(0xFFE5D2A8) else paper)
                            ) {
                                Row(Modifier.padding(13.dp), verticalAlignment = Alignment.CenterVertically) {
                                    Text(chapter.number.toString().padStart(3, '0'), color = Wine, fontWeight = FontWeight.Bold)
                                    Spacer(Modifier.width(12.dp))
                                    Column(Modifier.weight(1f)) {
                                        Text(chapter.title, color = Ink, fontWeight = FontWeight.SemiBold)
                                        Text(chapter.status, color = Ink.copy(alpha = .62f), fontSize = 10.sp)
                                    }
                                    Text("›", color = Gold, fontSize = 24.sp)
                                }
                            }
                        }
                    }
                } else {
                    Column(Modifier.weight(1f).padding(horizontal = 14.dp)) {
                        Card(Modifier.fillMaxSize(), shape = RoundedCornerShape(12.dp), colors = CardDefaults.cardColors(containerColor = paper)) {
                            LazyColumn(Modifier.fillMaxSize(), contentPadding = PaddingValues(19.dp)) {
                                item {
                                    Text("CAPÍTULO $selectedChapter", color = Wine, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.5.sp)
                                    Spacer(Modifier.height(7.dp))
                                    Image(painterResource(chapterArt), contentDescription = "Ilustración del capítulo $selectedChapter", modifier = Modifier.fillMaxWidth().height(132.dp))
                                    Spacer(Modifier.height(12.dp))
                                    Text(selected?.title ?: "Capítulo", color = text, fontSize = 24.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                                    Spacer(Modifier.height(9.dp))
                                    Text(selected?.editorialNote ?: "", color = text.copy(alpha = .72f), fontSize = 12.sp)
                                    Spacer(Modifier.height(17.dp))
                                }
                                items(selected?.verses ?: emptyList()) { verse ->
                                    Text(verse.reference, color = Wine, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                                    Spacer(Modifier.height(3.dp))
                                    Text(verse.text, color = text, fontSize = (16f * fontScale).sp, lineHeight = (25f * fontScale).sp)
                                    Spacer(Modifier.height(15.dp))
                                }
                                item {
                                    HorizontalDivider(color = Gold.copy(alpha = .5f))
                                    Spacer(Modifier.height(9.dp))
                                    Text("APARATO CRÍTICO", color = Wine, fontWeight = FontWeight.Bold, fontSize = 11.sp)
                                    Text(selected?.criticalNote ?: "Pendiente de cotejo documental.", color = text, fontSize = 12.sp)
                                    Spacer(Modifier.height(18.dp))
                                }
                            }
                        }
                    }
                }
                Row(
                    Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextButton(onClick = { selectedChapter = (selectedChapter - 1).coerceAtLeast(1); showIndex = false }) { Text("‹ Anterior", color = text) }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        TextButton(onClick = { fontScale = (fontScale - .1f).coerceAtLeast(.8f) }) { Text("A−", color = text) }
                        TextButton(onClick = { fontScale = (fontScale + .1f).coerceAtMost(1.5f) }) { Text("A+", color = text) }
                        TextButton(onClick = { night = !night }) { Text(if (night) "☀" else "☾", color = text) }
                    }
                    TextButton(onClick = { selectedChapter = (selectedChapter + 1).coerceAtMost(lastAvailableChapter); showIndex = false }) { Text("Siguiente ›", color = text) }
                }
            }
        }
    }
}
