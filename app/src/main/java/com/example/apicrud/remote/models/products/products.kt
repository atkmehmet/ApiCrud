package com.example.apicrud.remote.models.products

data class products(
   val   id: Int,
   val title: String,
   val description: String,
   val category: String,
   val price :Float,
   val discountPercentage: Float,
   val rating:Float,
   val stock: Int,
   val tags:List<String>,
   val brand: String,
   val sku: String,
   val weight: Int,
   val dimensions: dimensions,
   val warrantyInformation: String,
   val shippingInformation: String,
   val availabilityStatus: String,
   val reviews:List<reviews>,
   val returnPolicy: String,
   val minimumOrderQuantity: String,
   val meta:meta,
   val thumbnail: String,
   val images:List<String>
)
