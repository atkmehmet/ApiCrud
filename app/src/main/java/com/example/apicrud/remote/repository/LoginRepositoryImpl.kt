package com.example.apicrud.remote.repository

import com.example.apicrud.model.Repository.ILoginRepository
import com.example.apicrud.remote.apiRequest
import com.example.apicrud.remote.models.AuthDto
import com.example.apicrud.remote.models.Login
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val apiRequest: apiRequest
):ILoginRepository {
    override suspend fun getAccessToken(login: Login):AuthDto {
       return apiRequest.getAuth(login)
    }
}