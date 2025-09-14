package com.example.apicrud.repensatation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun productScreen(viewModel: ProductViewModel = hiltViewModel()){
    Column(modifier = Modifier.fillMaxSize()) {

        viewModel.product?.title?.let { Text(text = it) }

    }
}