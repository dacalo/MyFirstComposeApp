package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Pepe")
        Text(text = "Pepe rojo", color = Color.Red)
        Text(text = "Pepe", fontSize = 25.sp)
        Text("FontStyle", fontStyle = FontStyle.Italic)
        Text(
            "FontWeight",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp
        )
        Text("LetterSpacing", letterSpacing = 2.sp)
        Text("TextDecoration")
    }
}