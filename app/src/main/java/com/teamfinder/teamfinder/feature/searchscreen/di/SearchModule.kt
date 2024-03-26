package com.teamfinder.teamfinder.feature.searchscreen.di

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.searchscreen.presentation.SearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface SearchModule {

    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    @Binds
    fun bindVM(impl: SearchViewModel): ViewModel

}