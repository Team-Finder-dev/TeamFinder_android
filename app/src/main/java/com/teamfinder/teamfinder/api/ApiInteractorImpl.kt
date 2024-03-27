package com.teamfinder.teamfinder.api

import retrofit2.Response
import javax.inject.Inject

class ApiInteractorImpl @Inject constructor(private val apiService: ApiService) : ApiInteractor {

    override suspend fun post(url: String, body: Any, headers: Map<String, String>): Response<Any> =
        apiService.post(url = url, body = body, headers = headers)

    override suspend fun get(url: String, headers: Map<String, String>): Response<Any> =
        apiService.get(url = url, headers = headers)

}