package com.teamfinder.teamfinder.presentation.teamdetails.basic

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamDetailsBasicBinding

class TeamDetailsBasicFragment :
    BaseFragment<FragmentTeamDetailsBasicBinding, TeamDetailsBasicViewModel>(
        FragmentTeamDetailsBasicBinding::inflate
    ) {

    override val viewModel: TeamDetailsBasicViewModel by viewModels()

    companion object {
        fun newInstance() = TeamDetailsBasicFragment()
    }


}