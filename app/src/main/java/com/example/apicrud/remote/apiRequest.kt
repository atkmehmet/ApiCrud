package com.example.apicrud.remote

import com.example.apicrud.remote.models.AuthDto
import com.example.apicrud.remote.models.Login
import retrofit2.http.Body
import retrofit2.http.POST

interface  apiRequest {
    @POST("auth/login")
    suspend fun getAuth(@Body login: Login):AuthDto
}