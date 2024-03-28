package com.teamfinder.teamfinder.feature.teamdetails.di.info

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.teamdetails.presentation.info.TeamDetailsInfoViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface TeamDetailsInfoModule {

    @IntoMap
    @ViewModelKey(TeamDetailsInfoViewModel::class)
    @Binds
    fun bindVM(impl: TeamDetailsInfoViewModel): ViewModel
}