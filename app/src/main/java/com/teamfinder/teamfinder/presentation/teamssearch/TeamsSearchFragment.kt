package com.teamfinder.teamfinder.presentation.teamssearch

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamsSearchBinding

class TeamsSearchFragment :
    BaseFragment<FragmentTeamsSearchBinding, TeamsViewModel>(FragmentTeamsSearchBinding::inflate) {
    override val viewModel by viewModels<TeamsViewModel>()
}
