package com.example.apicrud.remote.models.products

data class productsResponse(

    val products: List<products>,
     val total: Int,
     val skip: Int,
     val limit: Int
)
