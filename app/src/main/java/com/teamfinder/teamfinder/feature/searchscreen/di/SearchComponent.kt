package com.teamfinder.teamfinder.feature.searchscreen.di

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [SearchModule::class]
)
interface SearchComponent : ScreenComponent