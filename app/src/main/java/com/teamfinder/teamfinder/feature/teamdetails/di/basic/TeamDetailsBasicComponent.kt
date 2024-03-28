package com.teamfinder.teamfinder.feature.teamdetails.di.basic

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [TeamDetailsBasicModule::class]
)
interface TeamDetailsBasicComponent : ScreenComponent