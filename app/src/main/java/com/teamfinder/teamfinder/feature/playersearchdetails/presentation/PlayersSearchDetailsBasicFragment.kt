package com.teamfinder.teamfinder.feature.playersearchdetails.presentation

import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.base.BaseViewModel
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchDetailsBasicBinding
import com.teamfinder.teamfinder.di.ScreenComponent

class PlayersSearchDetailsBasicFragment :
    BaseFragment<FragmentPlayersSearchDetailsBasicBinding, BaseViewModel>(
        FragmentPlayersSearchDetailsBasicBinding::inflate
    ) {
    override val viewModel: BaseViewModel
        get() = throw Exception(message = "No ViewModel")

    override fun diComponent(): ScreenComponent {
        TODO("Not yet implemented")
    }
}