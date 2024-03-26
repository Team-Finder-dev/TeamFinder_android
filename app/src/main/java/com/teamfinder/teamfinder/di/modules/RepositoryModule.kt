package com.teamfinder.teamfinder.di.modules

import com.teamfinder.teamfinder.api.ApiInteractor
import com.teamfinder.teamfinder.api.ApiInteractorImpl
import com.teamfinder.teamfinder.api.ApiRepository
import com.teamfinder.teamfinder.api.ApiService
import com.teamfinder.teamfinder.base.usecases.GetDataApiUseCase
import com.teamfinder.teamfinder.base.usecases.PostDataApiUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Named

const val GET_DATA_API = "GET_DATA_API"
const val POST_DATA_API = "POST_DATA_API"

@Module
class RepositoryModule {

    @Provides
    fun apiInteractor(apiService: ApiService): ApiInteractor = ApiInteractorImpl(apiService)

    @Provides
    fun apiRepository(interactor: ApiInteractor): ApiRepository = ApiRepository(interactor)

    @Provides
    @Named(GET_DATA_API)
    fun getDataApi(apiRepository: ApiRepository): GetDataApiUseCase = apiRepository

    @Provides
    @Named(POST_DATA_API)
    fun postDataApi(apiRepository: ApiRepository): PostDataApiUseCase = apiRepository

}