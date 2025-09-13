package com.example.apicrud.remote.models.products

data class reviews (
    val rating: Int,
    val comment: String,
    val date: String,
    val reviewerName: String,
    val reviewerEmail: String
)