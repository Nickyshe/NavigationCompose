package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.model.MyViewModel
import com.example.navigationcompose.ui.theme.ui.Screen1
import com.example.navigationcompose.ui.theme.ui.Screen2

@Composable
fun AppNavigation(){
    var navController = rememberNavController()
    var vm = viewModel<MyViewModel>()

    NavHost(navController = navController, startDestination = "screen_1"){
        composable("screen_1"){
            Screen1(navController,vm)
        }
        composable("screen_2"){
            Screen2(navController, vm)
        }
    }
}