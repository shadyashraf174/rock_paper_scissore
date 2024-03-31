package com.example.rps

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ComputerChoice() {
    val svgResources = listOf(
        R.drawable.rock_x,
        R.drawable.papar_x,
        R.drawable.scissors_xx,
    )
    val shady = (Math.random() * svgResources.size).toInt()

    Image(
        painter = painterResource(id = svgResources[shady]),
        contentDescription = null,
        modifier = Modifier
            .padding(8.dp)
    )
}