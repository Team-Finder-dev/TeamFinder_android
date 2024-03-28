package com.teamfinder.teamfinder.feature.teamdetails.di.basic

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.teamdetails.presentation.basic.TeamDetailsBasicViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface TeamDetailsBasicModule {

    @IntoMap
    @ViewModelKey(TeamDetailsBasicViewModel::class)
    @Binds
    fun bindVM(impl: TeamDetailsBasicViewModel): ViewModel
}