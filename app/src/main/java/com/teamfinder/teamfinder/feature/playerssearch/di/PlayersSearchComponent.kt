package com.teamfinder.teamfinder.feature.playerssearch.di

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [PlayersSearchModule::class]
)
interface PlayersSearchComponent : ScreenComponent