package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.R
import com.example.myfirstcomposeapp.components.state.CheckBoxState

@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by remember { mutableStateOf(true) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Switch(
            checked = switchState, onCheckedChange = { switchState = it },
            thumbContent = {
                Icon(
                    painter = painterResource(R.drawable.ic_personta),
                    contentDescription = "Hola",
                )
            },
            enabled = true,
            colors = SwitchDefaults.colors(
                //Bolita
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Green,
                //Icon
                checkedIconColor = Color.Green,
                uncheckedIconColor = Color.Cyan,
                disabledUncheckedIconColor = Color.Red,
                disabledCheckedIconColor = Color.Red,
                //Borde
                checkedBorderColor = Color.Magenta,
                uncheckedBorderColor = Color.Magenta,
                disabledCheckedBorderColor = Color.Magenta,
                disabledUncheckedBorderColor = Color.Magenta,
                //Track
                checkedTrackColor = Color.White,
                uncheckedTrackColor = Color.Black,
                disabledCheckedTrackColor = Color.White,
                disabledUncheckedTrackColor = Color.Black,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyCheckBox(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(true) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .clickable { state = !state },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = state,
                onCheckedChange = { state = it },
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Red,
                    checkmarkColor = Color.Blue,
                    uncheckedColor = Color.Green,
                    disabledCheckedColor = Color.Yellow,
                    disabledUncheckedColor = Color.Magenta
                )
            )
            Spacer(Modifier.width(8.dp))
            Text(text = "Acepto los terminos y condiciones")
        }
    }
}

@Composable
fun ParentCheckBoxes(modifier: Modifier = Modifier){
    var state by remember { mutableStateOf(listOf(
        CheckBoxState(id = "1", label = "Aceptar los terminos y condiciones"),
        CheckBoxState(id = "2", label = "Recibir la newsletter", checked = true),
        CheckBoxState(id = "3", label = "Recibir las actualizaciones"),
    )) }
    Column(modifier = modifier.fillMaxSize()) {
        state.forEach { myState ->
            CheckBoxWithtext(checkBoxState = myState) {
                state = state.map{
                    if(it.id == myState.id){
                        myState.copy(checked = !myState.checked)
                    }else {
                        it
                    }
                }
            }
        }
    }
}

@Composable
fun CheckBoxWithtext(
    modifier: Modifier = Modifier,
    checkBoxState: CheckBoxState,
    onCheckedChange: (CheckBoxState) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .clickable { onCheckedChange(checkBoxState) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onCheckedChange(checkBoxState) },
            enabled = true,

            )
        Spacer(Modifier.width(8.dp))
        Text(text = checkBoxState.label)
    }
}