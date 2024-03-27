package com.teamfinder.teamfinder.feature.playersearchdetails.presentation

import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.base.BaseViewModel
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchDetailsSkillsBinding
import com.teamfinder.teamfinder.di.ScreenComponent

class PlayersSearchDetailsSkillsFragment :
    BaseFragment<FragmentPlayersSearchDetailsSkillsBinding, BaseViewModel>(
        FragmentPlayersSearchDetailsSkillsBinding::inflate
    ) {
    override val viewModel: BaseViewModel
        get() = throw Exception(message = "No ViewModel")

    override fun diComponent(): ScreenComponent {
        TODO("Not yet implemented")
    }
}