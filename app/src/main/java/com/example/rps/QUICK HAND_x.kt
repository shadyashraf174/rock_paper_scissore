package com.example.rps

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun InfiniteSVGCarousel_x() {
    var index by remember { mutableIntStateOf(0) }

    val svgResources = listOf(
        R.drawable.rock_x,
        R.drawable.rock_x,
        R.drawable.papar_x,
        R.drawable.papar_x,
        R.drawable.scissors_xx,
        R.drawable.scissors_xx,
        R.drawable.scissors_xx,
    )

    LaunchedEffect(true) {
        while (true) {
            delay(100) // Change delay according to your requirement
            index = (index + 1) % svgResources.size
        }
    }

    Image(
        painter = painterResource(id = svgResources[index]),
        contentDescription = null,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    )
}

@Preview
@Composable
fun PreviewInfiniteSVGCarousel_x() {
    InfiniteSVGCarousel_x()
}