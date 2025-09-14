package com.example.apicrud.di

import com.example.apicrud.model.Repository.ProductRepository
import com.example.apicrud.remote.apis.apiProduct
import com.example.apicrud.remote.apis.apiRequest
import com.example.apicrud.remote.repository.ProductRepositoryImpl
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
    fun createService(retrofit: Retrofit): apiRequest {
        return retrofit.create(apiRequest::class.java)
    }

    @Singleton
    @Provides
    fun createApiProducts(retrofit: Retrofit):apiProduct{
        return retrofit.create(apiProduct::class.java)
    }
    @Singleton
    @Provides
    fun giveProductsRepository(apiProduct: apiProduct):ProductRepository{
        return ProductRepositoryImpl(apiProduct)
    }
}