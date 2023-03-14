package com.example.usecasetestapplication.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.domain.models.SaveDataModel

@Composable
fun MainScreen(viewModel: MainViewModel) {

    val name = remember { mutableStateOf("") }
    val new_name = remember { mutableStateOf("") }
    val result = remember { mutableStateOf("") }

    Column {

        Text(
            text = new_name.value
        )

        Text(
            text = result.value
        )
        
        Button(
            onClick = {
                new_name.value = viewModel.getData().name
            }
        ) {
            Text(text = "Get data")
        }
        
        TextField(
            value = name.value,
            onValueChange = {
                name.value = it
            }
        )
        
        Button(
            onClick = {
                result.value = viewModel.saveData(
                    SaveDataModel(
                        text = name.value
                    )
                ).toString()
            }
        ) {
            Text(text = "Save data")
        }
    }
}