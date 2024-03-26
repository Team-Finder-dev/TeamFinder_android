package com.teamfinder.teamfinder.feature.playerssearch.presentation

import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.playerssearch.di.DaggerPlayersSearchComponent

class PlayersSearchFragment : BaseFragment<FragmentPlayersSearchBinding, PlayersSearchViewModel>(
    FragmentPlayersSearchBinding::inflate
) {

    override val viewModel by injectViewModel<PlayersSearchViewModel>()

    override fun diComponent(): ScreenComponent = DaggerPlayersSearchComponent.create()

}