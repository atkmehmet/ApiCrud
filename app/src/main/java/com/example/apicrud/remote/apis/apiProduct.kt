package com.example.apicrud.remote.apis

import com.example.apicrud.remote.models.products.products
import com.example.apicrud.remote.models.products.productsResponse
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface  apiProduct {

@GET("products")
suspend fun  getProducts():productsResponse

@GET("products/search")
suspend fun getProductSearch( @Query("q") searchString: String):productsResponse

@GET("products")
suspend fun getProductsLimit(@Query("limit") limit:Int=10,@Query("skip") skip :Int,@Query("select") select:String):productsResponse

@GET("products")
suspend fun getProductOrders(@Query("sortBy") sortBy:String,@Query("order") order:String):productsResponse

@POST("products/add")
suspend fun  addProducts(products: products):products

@PUT("products/1")
suspend fun updateProducts(tile:String):products

@DELETE("products/1")
suspend fun deleteProducts():products


}