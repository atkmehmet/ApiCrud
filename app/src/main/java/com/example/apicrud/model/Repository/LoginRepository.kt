package com.example.apicrud.model.Repository

import com.example.apicrud.remote.apiRequest
import com.example.apicrud.remote.models.AuthDto
import com.example.apicrud.remote.models.Login
import com.example.apicrud.remote.models.Self

interface ILoginRepository {

    suspend fun getAccessToken(login: Login):AuthDto

    suspend fun getSelf(token:String):Self
}