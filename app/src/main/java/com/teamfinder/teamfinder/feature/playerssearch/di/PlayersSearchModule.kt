package com.teamfinder.teamfinder.feature.playerssearch.di

import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.di.ViewModelKey
import com.teamfinder.teamfinder.feature.playerssearch.presentation.PlayersSearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface PlayersSearchModule {

    @IntoMap
    @ViewModelKey(PlayersSearchViewModel::class)
    @Binds
    fun bindVM(impl: PlayersSearchViewModel): ViewModel
}