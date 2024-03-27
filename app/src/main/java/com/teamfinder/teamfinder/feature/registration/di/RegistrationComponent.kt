package com.teamfinder.teamfinder.feature.registration.di

import dagger.Component
import com.teamfinder.teamfinder.di.modules.ExternalModule
import com.teamfinder.teamfinder.di.modules.RepositoryModule
import com.teamfinder.teamfinder.di.ScreenComponent

@Component(
    modules = [
        RegistrationModule::class,
        RepositoryModule::class,
        ExternalModule::class
    ]
)
interface RegistrationComponent : ScreenComponent