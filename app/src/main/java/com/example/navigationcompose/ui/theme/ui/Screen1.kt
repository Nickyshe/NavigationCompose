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
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.navigationcompose.model.MyViewModel


@Composable
fun Screen1(navController: NavController, viewModel: MyViewModel) {
    val state by viewModel.stateFlow.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Screen 1 ", fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text =
            "${state.name}"
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "${state.age}"
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text =
            "${state.schoolName}"
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {
                navController.navigate("screen_2"

                )
                      },
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onPrimaryContainer),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Screen 1")

        }

    }
}
