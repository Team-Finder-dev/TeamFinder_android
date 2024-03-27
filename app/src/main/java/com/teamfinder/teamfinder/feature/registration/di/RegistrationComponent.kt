package com.teamfinder.teamfinder.feature.registration.di

import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.di.modules.ExternalModule
import com.teamfinder.teamfinder.di.modules.RepositoryModule
import dagger.Component

@Component(
    modules = [
        RegistrationModule::class,
        RepositoryModule::class,
        ExternalModule::class
    ]
)
interface RegistrationComponent : ScreenComponent