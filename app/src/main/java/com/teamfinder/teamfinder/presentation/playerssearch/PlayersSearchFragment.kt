package com.teamfinder.teamfinder.presentation.playerssearch

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchBinding

class PlayersSearchFragment :
    BaseFragment<FragmentPlayersSearchBinding, PlayersSearchViewModel>(
        FragmentPlayersSearchBinding::inflate,
    ) {
    override val viewModel by viewModels<PlayersSearchViewModel>()
}