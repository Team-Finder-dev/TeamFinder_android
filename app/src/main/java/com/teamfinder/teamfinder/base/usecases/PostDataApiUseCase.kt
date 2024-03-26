package com.teamfinder.teamfinder.base.usecases

interface PostDataApiUseCase {
    suspend fun post(url: String, body: Any, headers: Map<String, String>): Result<Any>
}