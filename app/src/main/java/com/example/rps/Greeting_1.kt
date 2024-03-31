package com.example.rps

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rps.ui.theme.RPSTheme

@Composable
fun Greeting_1(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(Color(0xFF9C27B0))

    )
    {
        Text(
            text = "Rock\n" +
                    "/ paper /\n" +
                    "scissors",
            modifier = modifier
                .fillMaxWidth(),
            fontSize = 50.sp,
            color = Color.White,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W100

        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            InfiniteSVGCarousel()
        }

        Button(

            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.End)
                .fillMaxWidth(1f),

            shape = RoundedCornerShape(15),
            onClick = { navHostController.navigate("S_2") },
            colors = ButtonDefaults.buttonColors(Color.White)
        )
        {
            Text(
                modifier = modifier,
                color = Color.Black,
                fontSize = 30.sp,
                fontWeight = FontWeight.Light,
                text = "Start",
            )
        }
        Spacer(modifier = modifier.padding(10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting_1Preview() {
    val navController = rememberNavController()
    RPSTheme {
        Greeting_1(navController)
    }
}