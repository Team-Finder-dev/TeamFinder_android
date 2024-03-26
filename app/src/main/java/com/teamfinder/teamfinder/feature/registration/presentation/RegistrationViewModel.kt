package com.teamfinder.teamfinder.feature.registration.presentation

import com.teamfinder.teamfinder.base.BaseViewModel
import com.teamfinder.teamfinder.base.usecases.GetDataApiUseCase
import com.teamfinder.teamfinder.base.usecases.PostDataApiUseCase
import com.teamfinder.teamfinder.di.modules.GET_DATA_API
import com.teamfinder.teamfinder.di.modules.POST_DATA_API
import javax.inject.Inject
import javax.inject.Named

class RegistrationViewModel @Inject constructor(
    @Named(GET_DATA_API)
    private val getDataApiUseCase: GetDataApiUseCase,
    @Named(POST_DATA_API)
    private val postDataApiUseCase: PostDataApiUseCase
) : BaseViewModel()