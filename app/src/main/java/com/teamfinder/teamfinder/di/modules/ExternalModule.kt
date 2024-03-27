package com.teamfinder.teamfinder.di.modules

import com.teamfinder.teamfinder.api.ApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://github.com/"
@Module
class ExternalModule {

    @Provides
    fun retrofit(): Retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun apiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
}