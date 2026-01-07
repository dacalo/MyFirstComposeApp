package com.example.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun MyComplexLayout(modifier: Modifier){
    Column(modifier = modifier) {
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)){}
        Spacer(Modifier.height(20.dp))
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Blue)){
            Row{
                Box(modifier = Modifier.weight(1f).height(25.dp).background(Color.Gray)){}
                Spacer(Modifier.width(20.dp))
                Box(modifier = Modifier.weight(1f).height(185.dp).background(Color.Green)){
                    Text("Hola mundo")
                }
            }
        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Yellow)){}
    }
}