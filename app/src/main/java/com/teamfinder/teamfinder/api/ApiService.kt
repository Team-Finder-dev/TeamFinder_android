package com.teamfinder.teamfinder.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.POST

interface ApiService {

    @POST
    suspend fun <T> post(url: String, @Body body: Any, headers: Map<String, String>): Response<T>

    @GET
    suspend fun <T> get(url: String, @HeaderMap headers: Map<String, String>): Response<T>
}