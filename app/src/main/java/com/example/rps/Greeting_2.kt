package com.example.rps

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rps.ui.theme.RPSTheme

@Composable
fun Greeting_2(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxSize()
            .fillMaxHeight()
    )
    {
        Button(
            modifier = modifier,
            shape = RoundedCornerShape(10),
            onClick = { navHostController.navigate("S_1") },
            colors = ButtonDefaults.buttonColors(Color.Transparent)
        )
        {

            Text(
                modifier = modifier,
                color = Color.Black,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                text = "<"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            InfiniteSVGCarousel_x()
        }

        Text(
            text = "Let’s play!",
            modifier = modifier
                .fillMaxWidth(),
            fontSize = 50.sp,
            color = Color.Black,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = modifier.padding(10.dp))

        Text(
            text = "pick an option:",
            modifier = modifier
                .fillMaxWidth(),
            fontSize = 30.sp,
            color = Color.Black,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
        )
        Row(horizontalArrangement = Arrangement.Absolute.SpaceAround) {

            IconButton(
                modifier = modifier
                    .weight(1f)
                    .padding(50.dp),
                onClick = { navHostController.navigate("S_3") }
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.rock),
                    contentDescription = null,
//            modifier = Modifier.size(24.dp)
                )
            }
            IconButton(
                modifier = modifier
                    .weight(1f)
                    .padding(50.dp),
                onClick = { navHostController.navigate("S_4") }
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.papar),
                    contentDescription = null,
//            modifier = Modifier.size(24.dp)
                )
            }
            IconButton(
                modifier = modifier
                    .weight(1f)
                    .padding(50.dp),
                onClick = { navHostController.navigate("S_5") }
            ) {
                Image(
                    modifier = modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.scissors),
                    contentDescription = null,
//            modifier = Modifier.size(24.dp)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting_2Preview() {
    val navController = rememberNavController()
    RPSTheme {
        Greeting_2(navController)
    }
}