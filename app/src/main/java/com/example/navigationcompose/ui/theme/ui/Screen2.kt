package com.example.navigationcompose.ui.theme.ui

import android.annotation.SuppressLint
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
import com.example.navigationcompose.model.Details
import com.example.navigationcompose.model.MyViewModel


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen2(navController: NavController, viewModel: MyViewModel) {

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var schoolName by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Screen 2 ", fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = name, onValueChange = {
            name = it
        }, placeholder = { Text(text = "Enter your name") },
            maxLines = 1

        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = age, onValueChange = {
            age = it
        }, placeholder = { Text(text = "Enter your age") },
            maxLines = 1

        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = schoolName, onValueChange = {
            schoolName = it
        }, placeholder = { Text(text = "Enter your School name") },
            maxLines = 1

        )


        Spacer(modifier = Modifier.height(40.dp))



        Button(
            onClick = {
         val details = Details(
                  name = name,
                  age = age,
                  schoolName = schoolName
              )
                viewModel.update(details)
navController.popBackStack()

                      },
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.onPrimaryContainer),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(text = "Save")

        }

    }


}
