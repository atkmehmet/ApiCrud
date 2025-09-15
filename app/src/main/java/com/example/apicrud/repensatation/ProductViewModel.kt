package com.example.apicrud.repensatation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apicrud.model.Repository.ProductRepository
import com.example.apicrud.remote.models.products.products
import com.example.apicrud.remote.models.products.productsResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor (
    private val repository: ProductRepository
):ViewModel() {
    var product by mutableStateOf<products?>(null)
    var products by mutableStateOf<productsResponse?>(null)

    var productList by mutableStateOf<List<products>>(emptyList())

    init {
        viewModelScope.launch {
           //product = repository.deleteProducts()

            products = repository.getProducts()

            productList = products!!.products
        }

    }

}