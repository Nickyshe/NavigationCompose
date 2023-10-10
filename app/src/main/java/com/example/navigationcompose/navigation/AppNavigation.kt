package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationcompose.ui.theme.ui.Screen1
import com.example.navigationcompose.ui.theme.ui.Screen2

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen_1") {
        composable("screen_1") {
            Screen1(navController)
        }
        composable(
            "screen_2/{name}/{age}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                },
                navArgument(name = "age") {
                    type = NavType.IntType
                }
            )
        ) { backstackEntry ->
            Screen2(
                name = backstackEntry.arguments?.getString("name"),
                age = backstackEntry.arguments?.getInt("age")
            )
        }

    }
}


