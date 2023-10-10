package com.example.navigationcompose.ui.theme.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Screen 1 ", fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = name, onValueChange = {
            name = it
        }, placeholder = { Text(text = "Enter your name") }

        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = age, onValueChange = {
            age = it
        }, placeholder = { Text(text = "Enter your age") }

        )


        Spacer(modifier = Modifier.height(30.dp))



        Button(
            onClick = { navController.navigate("screen_2/ $name/$age") },
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onPrimaryContainer),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Screen 1")

        }

    }
}
