package com.teamfinder.teamfinder.feature.teamssearch.di

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [TeamsSearchModule::class]
)
interface TeamsSearchComponent : ScreenComponent