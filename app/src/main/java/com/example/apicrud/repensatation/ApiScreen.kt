package com.example.apicrud.repensatation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ApiScreen(
    viewModel: ApiViewModel = hiltViewModel()
) {
    Column(modifier = Modifier.fillMaxSize()
        ) {

        Text(text = viewModel.selfDto.email)

    }
}