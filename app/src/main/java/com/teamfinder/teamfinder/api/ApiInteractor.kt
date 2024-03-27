package com.teamfinder.teamfinder.api

import retrofit2.Response

interface ApiInteractor {

    suspend fun post(url: String, body: Any, headers: Map<String, String>): Response<Any>

    suspend fun get(url: String, headers: Map<String, String>): Response<Any>
}