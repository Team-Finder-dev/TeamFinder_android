package com.teamfinder.teamfinder

import android.app.Application
import com.teamfinder.teamfinder.di.AppComponent
import com.teamfinder.teamfinder.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    companion object {
        lateinit var component: AppComponent
    }

}