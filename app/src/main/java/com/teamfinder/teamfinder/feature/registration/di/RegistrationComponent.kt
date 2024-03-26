package com.teamfinder.teamfinder.feature.registration.di

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [RegistrationModule::class]
)
interface RegistrationComponent : ScreenComponent