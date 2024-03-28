package com.teamfinder.teamfinder.feature.teamdetails.di

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [TeamDetailsModule::class]
)
interface TeamDetailsComponent : ScreenComponent