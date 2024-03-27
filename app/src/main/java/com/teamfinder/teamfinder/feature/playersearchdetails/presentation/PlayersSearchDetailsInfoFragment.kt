package com.teamfinder.teamfinder.feature.playersearchdetails.presentation

import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.base.BaseViewModel
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchDetailsInfoBinding
import com.teamfinder.teamfinder.di.ScreenComponent

class PlayersSearchDetailsInfoFragment :
    BaseFragment<FragmentPlayersSearchDetailsInfoBinding, BaseViewModel>(
        FragmentPlayersSearchDetailsInfoBinding::inflate
    ) {
    override val viewModel: BaseViewModel
        get() = throw Exception(message = "No ViewModel")

    override fun diComponent(): ScreenComponent {
        TODO("Not yet implemented")
    }
}