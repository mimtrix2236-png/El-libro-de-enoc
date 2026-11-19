package com.mimtrix.libroenoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
private val ink = Color(0xFF382719)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { EnocReader() }
    }
}

@Composable
fun EnocReader() {
    var chapter by remember { mutableIntStateOf(1) }
    var fontSize by remember { mutableFloatStateOf(19f) }
    var showIndex by remember { mutableStateOf(false) }
    MaterialTheme {
        Surface(Modifier.fillMaxSize(), color = parchment, contentColor = ink) {
            Column(Modifier.fillMaxSize().padding(18.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("LIBRO DE ENOC", fontSize = 22.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                Text("Edición de lectura · Manuscrito", fontSize = 13.sp)
                Spacer(Modifier.height(12.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Button(onClick = { showIndex = !showIndex }, colors = ButtonDefaults.buttonColors(containerColor = ink)) { Text(if (showIndex) "Volver al libro" else "Índice") }
                    OutlinedButton(onClick = { fontSize = (fontSize - 1).coerceAtLeast(14f) }) { Text("A−") }
                    OutlinedButton(onClick = { fontSize = (fontSize + 1).coerceAtMost(30f) }) { Text("A+") }
                }
                Spacer(Modifier.height(14.dp))
                Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFFF3E7CF), RoundedCornerShape(8.dp)).padding(18.dp)) {
                    if (showIndex) {
                        Column {
                            Text("ÍNDICE", fontSize = 24.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                            Spacer(Modifier.height(10.dp))
                            Text("1–36 · Libro de los Vigilantes\n37–71 · Parábolas\n72–82 · Libro Astronómico\n83–90 · Visiones\n91–108 · Epístolas y exhortaciones", fontSize = fontSize.sp, lineHeight = (fontSize * 1.5).sp)
                        }
                    } else {
                        Column {
                            Text("CAPÍTULO $chapter", fontSize = 23.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Serif)
                            Spacer(Modifier.height(12.dp))
                            Text("Texto de edición en preparación", fontSize = fontSize.sp, lineHeight = (fontSize * 1.55).sp)
                            Spacer(Modifier.height(8.dp))
                            Text("Aquí se incorporará el texto de una edición verificable, con referencias de fuente y notas editoriales. Esta pantalla es un prototipo y todavía no contiene el texto completo.", fontSize = fontSize.sp, lineHeight = (fontSize * 1.55).sp)
                        }
                    }
                }
                Spacer(Modifier.height(12.dp))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Button(onClick = { chapter = (chapter - 1).coerceAtLeast(1) }, colors = ButtonDefaults.buttonColors(containerColor = ink)) { Text("‹ Anterior") }
                    Text("$chapter / 108", fontWeight = FontWeight.Bold)
                    Button(onClick = { chapter = (chapter + 1).coerceAtMost(108) }, colors = ButtonDefaults.buttonColors(containerColor = ink)) { Text("Siguiente ›") }
                }
            }
        }
    }
}
