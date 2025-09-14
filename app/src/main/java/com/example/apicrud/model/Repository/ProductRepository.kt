package com.example.apicrud.model.Repository

import com.example.apicrud.remote.models.products.products
import com.example.apicrud.remote.models.products.productsResponse
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ProductRepository {


    suspend fun  getProducts(): productsResponse


    suspend fun getProductSearch(  searchString: String): productsResponse


    suspend fun getProductsLimit( limit:Int,  skip :Int,  select:String):productsResponse


    suspend fun getProductOrders( sortBy:String, order:String):productsResponse


    suspend fun  addProducts(products: products): products


    suspend fun updateProducts(tile:String): products


    suspend fun deleteProducts(): products
}