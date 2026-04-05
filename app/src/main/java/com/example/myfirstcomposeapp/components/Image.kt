package com.example.myfirstcomposeapp.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.myfirstcomposeapp.R


@Composable
fun MyImage() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Avatar image profile",
        modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(50))
            .border(width = 5.dp, color = Color.Red, shape = RoundedCornerShape(50)),
        contentScale = ContentScale.Inside
    )
}

@Composable
fun MyNetworkImage(modifier: Modifier = Modifier) {
    AsyncImage(
        model = "https://gocheck.blob.core.windows.net/usuarios/5d422a33-8e14-4f34-8710-40931c56b914.jpg",
        contentDescription = "Hola mundo",
        modifier = Modifier.size(250.dp),
        onError = {
            Log.i("AsyncImage", "Ha ocurrido un erro ${it.result.throwable.message}")
        }

    )
}

@Preview
@Composable
fun MyIcon(modifier: Modifier = Modifier) {
    Icon(
        painter = painterResource(R.drawable.ic_personta), contentDescription = "Hola",
        modifier = Modifier.size(300.dp),
        tint = Color.Blue
    )
}
