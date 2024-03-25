package com.teamfinder.teamfinder.presentation.playerssearch

import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchBinding

class PlayersSearchFragment : BaseFragment<FragmentPlayersSearchBinding, PlayersSearchViewModel>(
    FragmentPlayersSearchBinding::inflate
) {

    override val viewModel: PlayersSearchViewModel by lazy {
        ViewModelProvider(viewModelStore, (requireActivity() as MainActivity).factory)[PlayersSearchViewModel::class.java]
    }

}