package com.teamfinder.teamfinder.di

import com.teamfinder.teamfinder.StartFragment
import dagger.Component

@Component(
    modules = [
        ViewModelModule::class
    ]
)
interface AppComponent {

    fun inject(startFragment: StartFragment)
}