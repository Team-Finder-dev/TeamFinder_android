package com.teamfinder.teamfinder.base.usecases

interface GetDataApiUseCase {

    suspend fun get(url: String, headers: Map<String, String>): Result<Any>
}