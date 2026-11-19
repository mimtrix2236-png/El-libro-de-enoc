package com.mimtrix.libroenoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val parchment = Color(0xFFE8D6B4)
private val paper = Color(0xFFF3E7CF)
private val ink = Color(0xFF382719)

private data class BookPage(val title: String, val body: String)

private val frontMatter = listOf(
    BookPage("Página de título", "EL LIBRO DE ENOC\n\nEdición de lectura\n\nMauro Iván Maidana\n\n18 de noviembre de 2026"),
    BookPage("Dedicatoria", "Página de dedicatoria\n\nEste espacio queda reservado para una dedicatoria personal del autor."),
    BookPage("Nota editorial", "Esta edición se preparará con atención a la historia de los manuscritos y a las diferencias entre versiones. Las traducciones, notas, fragmentos y reconstrucciones se identificarán por separado. No se presentará una reconstrucción como si fuera un pasaje conservado."),
    BookPage("Prólogo", "El Libro de Enoc es una colección antigua de escritos apocalípticos vinculados a la figura de Enoc, personaje mencionado en la tradición bíblica. Esta edición busca acercar el texto al lector mediante una presentación clara, notas de contexto y referencias de fuentes.\n\nEl prólogo definitivo será revisado junto con la bibliografía y la edición textual elegida."),
    BookPage("Introducción histórica", "La colección conocida como 1 Enoc reúne materiales de épocas y géneros diferentes. Los manuscritos arameos hallados entre los Rollos del Mar Muerto permiten estudiar testimonios antiguos de varias partes de la obra. La versión etíope conserva la colección completa de 108 capítulos.\n\nEn esta introducción se desarrollarán la historia de transmisión, las lenguas, los manuscritos y el contexto histórico, con referencias verificables."),
    BookPage("Índice general", "I. Libro de los Vigilantes (capítulos 1–36)\nII. Parábolas (37–71)\nIII. Libro Astronómico (72–82)\nIV. Libro de los Sueños (83–90)\nV. Epístola de Enoc y exhortaciones (91–108)\n\nApéndices: manuscritos y fragmentos; textos relacionados; glosario; bibliografía.")
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { EnocReader() }
    }
}

@Composable
fun EnocReader() {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("enoc_reader", android.content.Context.MODE_PRIVATE) }
    var page by remember { mutableIntStateOf(prefs.getInt("page", 0)) }
    var chapter by remember { mutableIntStateOf(prefs.getInt("chapter", 1)) }
    var fontSize by remember { mutableFloatStateOf(19f) }
    var indexMode by remember { mutableStateOf(false) }
    var bookmarkPage by remember { mutableIntStateOf(prefs.getInt("bookmark_page", 0)) }
    var bookmarkChapter by remember { mutableIntStateOf(prefs.getInt("bookmark_chapter", 1)) }
    var nightMode by remember { mutableStateOf(prefs.getBoolean("night_mode", false)) }
    val activePaper = if (nightMode) Color(0xFF302820) else paper
    val activeInk = if (nightMode) Color(0xFFE8D6B4) else ink
    val activeBackground = if (nightMode) Color(0xFF191512) else parchment

    MaterialTheme {
        Surface(Modifier.fillMaxSize(), color = activeBackground, contentColor = activeInk) {
            Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("EL LIBRO DE ENOC", fontSize = 22.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                Text("Edición de lectura · Mauro Iván Maidana", fontSize = 12.sp)
                Spacer(Modifier.height(10.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    Button(onClick = { indexMode = !indexMode }, colors = ButtonDefaults.buttonColors(containerColor = activeInk)) { Text(if (indexMode) "Libro" else "Índice") }
                    OutlinedButton(onClick = { fontSize = (fontSize - 1).coerceAtLeast(14f) }) { Text("A−") }
                    OutlinedButton(onClick = { fontSize = (fontSize + 1).coerceAtMost(30f) }) { Text("A+") }
                    OutlinedButton(onClick = { nightMode = !nightMode; prefs.edit().putBoolean("night_mode", nightMode).apply() }) { Text(if (nightMode) "☀" else "☾") }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedButton(onClick = { bookmarkPage = page; bookmarkChapter = chapter; prefs.edit().putInt("bookmark_page", page).putInt("bookmark_chapter", chapter).apply() }) { Text("Guardar") }
                    OutlinedButton(onClick = { page = bookmarkPage; chapter = bookmarkChapter; indexMode = false }) { Text("Marcador") }
                }
                Spacer(Modifier.height(10.dp))
                Box(Modifier.weight(1f).fillMaxWidth().background(activePaper, RoundedCornerShape(8.dp)).padding(18.dp)) {
                    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
                        if (indexMode) {
                            Text("ÍNDICE", fontSize = 25.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                            Spacer(Modifier.height(12.dp))
                            frontMatter.forEachIndexed { i, item ->
                                Text("${i + 1}. ${item.title}", fontSize = fontSize.sp, modifier = Modifier.padding(vertical = 4.dp))
                            }
                            Spacer(Modifier.height(8.dp))
                            Text("TEXTO PRINCIPAL", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                            Text("1–36 · Libro de los Vigilantes\n37–71 · Parábolas\n72–82 · Libro Astronómico\n83–90 · Libro de los Sueños\n91–108 · Epístola y exhortaciones", fontSize = fontSize.sp, lineHeight = (fontSize * 1.5).sp)
                            Text("APÉNDICES\nManuscritos y fragmentos · Textos relacionados · Glosario · Bibliografía", fontSize = fontSize.sp, lineHeight = (fontSize * 1.5).sp)
                        } else if (page < frontMatter.size) {
                            val item = frontMatter[page]
                            Text(item.title.uppercase(), fontSize = 23.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                            Spacer(Modifier.height(14.dp))
                            Text(item.body, fontSize = fontSize.sp, lineHeight = (fontSize * 1.6).sp)
                        } else {
                            Text("CAPÍTULO $chapter", fontSize = 23.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                            Spacer(Modifier.height(12.dp))
                            Text("Texto del capítulo pendiente de incorporar desde una edición y fuente verificadas.", fontSize = fontSize.sp, lineHeight = (fontSize * 1.6).sp)
                            Spacer(Modifier.height(10.dp))
                            Text("Esta pantalla es una maqueta: todavía no contiene el texto completo.", fontSize = (fontSize - 2).sp, lineHeight = (fontSize * 1.5).sp)
                        }
                    }
                }
                Spacer(Modifier.height(10.dp))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Button(onClick = { if (page > 0) page-- else chapter = (chapter - 1).coerceAtLeast(1); prefs.edit().putInt("page", page).putInt("chapter", chapter).apply() }, colors = ButtonDefaults.buttonColors(containerColor = activeInk)) { Text("‹ Anterior") }
                    Text(if (page < frontMatter.size) "Preliminar ${page + 1}/${frontMatter.size}" else "Cap. $chapter / 108", fontWeight = FontWeight.Bold)
                    Button(onClick = { if (page < frontMatter.size - 1) page++ else if (page < frontMatter.size) { page = frontMatter.size; chapter = 1 } else chapter = (chapter + 1).coerceAtMost(108); prefs.edit().putInt("page", page).putInt("chapter", chapter).apply() }, colors = ButtonDefaults.buttonColors(containerColor = activeInk)) { Text("Siguiente ›") }
                }
            }
        }
    }
}
