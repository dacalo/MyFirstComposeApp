package com.example.myfirstcomposeapp.components.layout

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyRow(modifier: Modifier = Modifier){
    Row(modifier = modifier.fillMaxSize().horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.SpaceAround) {
        Text("Hola 1")
        Text("Hola 2")
        Text("Hola 3")
        Text("Hola 4")
    }

}