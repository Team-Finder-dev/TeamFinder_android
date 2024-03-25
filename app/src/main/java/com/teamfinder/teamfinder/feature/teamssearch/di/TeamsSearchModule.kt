package com.teamfinder.teamfinder.feature.teamssearch.di

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.teamssearch.presentation.TeamsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface TeamsSearchModule {

    @IntoMap
    @ViewModelKey(TeamsViewModel::class)
    @Binds
    fun bindVM(impl: TeamsViewModel) : ViewModel

}