package com.teamfinder.teamfinder.presentation.teamssearch

import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamsSearchBinding

class TeamsSearchFragment : BaseFragment<FragmentTeamsSearchBinding, TeamsViewModel>(
        FragmentTeamsSearchBinding::inflate
) {
    override val viewModel: TeamsViewModel by lazy {
        ViewModelProvider(viewModelStore, (requireActivity() as MainActivity).factory)[TeamsViewModel::class.java]
    }

}