package com.example.rps

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rps.rpsPages.PaperPage
import com.example.rps.rpsPages.ScissorPage
import com.example.rps.rpsPages.RockPage

@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "S_1") {
        composable("S_1") {
            Greeting_1(navController)
        }
        composable("S_2") {
            Greeting_2(navController)
        }
        composable("S_3") {
            RockPage(navController)
        }
        composable("S_4") {
            PaperPage(navController)
        }
        composable("S_5") {
            ScissorPage(navController)
        }
    }
}// how to fix the code