package com.teamfinder.teamfinder

import android.app.Application
import com.teamfinder.teamfinder.di.AppComponent
import com.teamfinder.teamfinder.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        _component = DaggerAppComponent.create()
    }

    companion object {
        private lateinit var _component: AppComponent
        val component: AppComponent
            get() = _component
    }

}