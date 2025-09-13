package com.example.apicrud.remote.apis

import com.example.apicrud.remote.models.products.products
import com.example.apicrud.remote.models.products.productsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface  apiProduct {

@GET("products")
suspend fun  getProducts():productsResponse

@GET("products/search")
suspend fun getProductSearch( @Query("q") searchString: String):productsResponse
}