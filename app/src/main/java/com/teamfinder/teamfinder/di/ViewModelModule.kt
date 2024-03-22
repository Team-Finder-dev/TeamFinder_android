package com.teamfinder.teamfinder.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.presentation.contacts.ContactsViewModel
import com.teamfinder.teamfinder.presentation.playerssearch.PlayersSearchViewModel
import com.teamfinder.teamfinder.presentation.registration.RegistrationViewModel
import com.teamfinder.teamfinder.presentation.searchscreen.SearchViewModel
import com.teamfinder.teamfinder.presentation.teamssearch.TeamsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun viewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ContactsViewModel::class)
    abstract fun contactsViewModel(contactsViewModel: ContactsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PlayersSearchViewModel::class)
    abstract fun playersSearchViewModel(playersSearchViewModel: PlayersSearchViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun registrationViewModel(registrationViewModel: RegistrationViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun searchViewModel(searchViewModel: SearchViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TeamsViewModel::class)
    abstract fun teamsViewModel(teamsViewModel: TeamsViewModel): ViewModel
}