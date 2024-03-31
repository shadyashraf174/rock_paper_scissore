package com.example.rps.rpsPages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.rps.ComputerChoice
import com.example.rps.R
import com.example.rps.ui.theme.RPSTheme

@Composable
fun PaperPage(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxSize()
            .fillMaxHeight()
    )
    {

        Button(
            modifier = modifier,
            onClick = { navHostController.navigate("S_1") },
            colors = ButtonDefaults.buttonColors(Color.Transparent)
        )
        {

            Text(
                modifier = modifier.fillMaxWidth(),
                color = Color.Black,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                text = "X"
            )
        }

        ComputerChoice()

        Button(

            modifier = modifier
                .padding(start = 50.dp, end = 50.dp, top = 8.dp)
                .align(Alignment.End)
                .fillMaxWidth(1f),

            shape = RoundedCornerShape(10),
            onClick = { navHostController.navigate("S_2") },
            colors = ButtonDefaults.buttonColors(Color(0xFF9C27B0))
        )
        {
            Text(
                modifier = modifier,
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Light,
                text = "Play again",
            )
        }
        Image(
            modifier = modifier.padding(16.dp),
            painter = painterResource(id = R.drawable.svg1),
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PaperPagePagePreview() {
    val navController = rememberNavController()
    RPSTheme {
        PaperPage(navController)
    }
}