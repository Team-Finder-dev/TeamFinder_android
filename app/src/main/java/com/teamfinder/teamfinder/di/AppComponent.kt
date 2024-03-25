package com.teamfinder.teamfinder.di

import dagger.Component

@Component(
    modules = [
        ViewModelModule::class
    ]
)
interface AppComponent : ScreenComponent