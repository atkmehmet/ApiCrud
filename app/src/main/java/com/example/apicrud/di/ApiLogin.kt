package com.example.apicrud.di

import com.example.apicrud.remote.apiRequest
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiLogin {

    @Singleton
    @Provides
    fun createApi():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun createService(retrofit: Retrofit):apiRequest{
        return retrofit.create(apiRequest::class.java)
    }
}