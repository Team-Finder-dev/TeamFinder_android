package com.teamfinder.teamfinder.api

import com.teamfinder.teamfinder.base.usecases.GetDataApiUseCase
import com.teamfinder.teamfinder.base.usecases.PostDataApiUseCase
import java.io.IOException
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private val interactor: ApiInteractor
) : GetDataApiUseCase, PostDataApiUseCase {

    override suspend fun post(url: String, body: Any, headers: Map<String, String>): Result<Any> {
        val response = interactor.post(url, body, headers)

        return if (response.isSuccessful && response.body() != null) {
            // преобразовать данные полученные от api
            val mappedData = response.body()!!
            Result.success(mappedData)
        } else {
            // Можно написать кастомные ошибки
            Result.failure(IOException("Server error"))
        }
    }

    override suspend fun get(url: String, headers: Map<String, String>): Result<Any> {
        val response = interactor.get(url, headers)

        return if (response.isSuccessful && response.body() != null) {
            val mappedData = response.body()!!
            Result.success(mappedData)
        } else {
            Result.failure(IOException("ServerError"))
        }
    }
}