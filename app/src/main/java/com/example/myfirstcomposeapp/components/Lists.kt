package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyBasicList(modifier: Modifier = Modifier, onItemClick: (String) -> Unit){
    val names = listOf("David", "Paola", "Mildrett", "Linda", "Sofia", "Susana", "Ana", "David", "Paola", "Mildrett", "Linda", "Sofia", "Susana", "Ana", "David", "Paola", "Mildrett", "Linda", "Sofia", "Susana", "Ana","David", "Paola", "Mildrett", "Linda", "Sofia", "Susana", "Ana")

    LazyRow {
        items(names, key = {myValue -> myValue}){myValue ->
            Text(myValue, modifier = Modifier
                .padding(24.dp)
                .clickable{onItemClick(myValue)})
        }
    }
}

@Composable
fun MyAdvanceList(modifier: Modifier = Modifier){
    var items by remember { mutableStateOf(List(100){"Item $it"})}

    LazyColumn {
        item{
            Button({
                items = items.toMutableList().apply {
                    add(0, "Hola")
                }
            }) { Text(text = "Agregar") }
        }
        itemsIndexed(items, key ={_, item -> item }) { index, item ->
            Row{
                Text(text = "$item Indice: $index")
                Spacer(Modifier.weight(1f))
                TextButton({items = items.toMutableList().apply {
                    removeAt(index)
                }}) { Text(text = "Eliminar") }
                Spacer(Modifier.width(24.dp))
            }
        }
    }
}