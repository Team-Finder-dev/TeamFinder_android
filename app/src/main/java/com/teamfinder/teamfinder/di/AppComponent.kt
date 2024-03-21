package com.teamfinder.teamfinder.di

import com.teamfinder.teamfinder.MainActivity
import dagger.Component

@Component(
    modules = [
        ViewModelModule::class
    ]
)
interface AppComponent {

    fun inject(baseFragment: MainActivity)
}