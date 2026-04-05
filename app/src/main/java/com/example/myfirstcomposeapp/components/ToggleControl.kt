package com.example.myfirstcomposeapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
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
import com.example.myfirstcomposeapp.R

@Preview(showBackground = true)
@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by remember { mutableStateOf(false) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Switch(
            checked = switchState, onCheckedChange = { switchState = it },
//            thumbContent = {
//                Icon(
//                    painter = painterResource(R.drawable.ic_launcher_background),
//                )
//            }
            enabled = false,
            colors = SwitchDefaults.colors(
                //Bolita
                checkedThumbColor = Color.Red,
                uncheckedThumbColor = Color.Blue,
                disabledCheckedThumbColor = Color.Yellow,
                disabledUncheckedThumbColor = Color.Green,
                //Icon
                checkedIconColor = Color.Green,
                uncheckedIconColor = Color.Cyan,
                disabledCheckedIconColor = Color.Red,

                checkedTrackColor = Color.Red,
                uncheckedTrackColor = Color.Blue,
                disabledCheckedTrackColor = Color.Yellow,
                disabledUncheckedTrackColor = Color.Green,
            )
        )

    }
}