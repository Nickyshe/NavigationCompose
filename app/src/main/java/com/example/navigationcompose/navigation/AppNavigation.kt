package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.theme.ui.Screen1
import com.example.navigationcompose.ui.theme.ui.Screen2
import com.example.navigationcompose.ui.theme.ui.Screen3


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen_1"){
        composable("screen_1"){
            Screen1(navController)
        }
        composable("screen_2"){
            Screen2(navController)
        }
        composable("screen_3"){
            Screen3(navController)
        }
    }
}
