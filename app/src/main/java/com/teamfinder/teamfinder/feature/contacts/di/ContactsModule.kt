package com.teamfinder.teamfinder.feature.contacts.di

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.contacts.presntation.ContactsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ContactsModule {

    @IntoMap
    @ViewModelKey(ContactsViewModel::class)
    @Binds
    fun bindVM(impl: ContactsViewModel) : ViewModel
}