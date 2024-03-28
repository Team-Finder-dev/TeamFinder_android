package com.teamfinder.teamfinder.feature.teamdetails.di

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.teamdetails.presentation.TeamDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface TeamDetailsModule {

    @IntoMap
    @ViewModelKey(TeamDetailsViewModel::class)
    @Binds
    fun bindVM(impl: TeamDetailsViewModel): ViewModel


}