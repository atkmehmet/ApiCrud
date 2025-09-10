package com.example.apicrud.di

import com.example.apicrud.model.Repository.ILoginRepository
import com.example.apicrud.remote.repository.LoginRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ApiRepository {
    @Binds
    abstract  fun getRepository(impl: LoginRepositoryImpl):ILoginRepository
}