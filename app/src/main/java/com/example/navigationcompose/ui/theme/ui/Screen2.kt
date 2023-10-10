package com.example.navigationcompose.ui.theme.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen2(
    name: String?,
    age: Int?
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen 2 Details",
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "My name is: $name",
            fontSize = 20.sp)
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "My age is: $age",
            fontSize = 20.sp)


    }
}


