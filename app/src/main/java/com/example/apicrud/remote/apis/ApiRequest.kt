package com.example.apicrud.remote.apis

import com.example.apicrud.remote.models.AuthDto
import com.example.apicrud.remote.models.Login
import com.example.apicrud.remote.models.Self
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface  apiRequest {
    @POST("auth/login")
    suspend fun getAuth(@Body login: Login):AuthDto

    @GET("auth/me")
    suspend fun getSelf(@Header("Authorization") token: String ):Self
}