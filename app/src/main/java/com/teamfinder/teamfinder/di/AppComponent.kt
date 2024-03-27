package com.teamfinder.teamfinder.di

import com.teamfinder.teamfinder.di.modules.ExternalModule
import com.teamfinder.teamfinder.di.modules.RepositoryModule
import dagger.Component

@Component(
    modules = [
        ExternalModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent