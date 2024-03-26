package com.teamfinder.teamfinder.feature.contacts.di

import com.teamfinder.teamfinder.di.ScreenComponent
import dagger.Component

@Component(
    modules = [ContactsModule::class]
)
interface ContactsComponent : ScreenComponent