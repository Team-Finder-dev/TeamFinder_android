package com.teamfinder.teamfinder.feature.registration.di

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.registration.presentation.RegistrationViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface RegistrationModule {
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    @Binds
    fun bindVM(impl: RegistrationViewModel): ViewModel
}