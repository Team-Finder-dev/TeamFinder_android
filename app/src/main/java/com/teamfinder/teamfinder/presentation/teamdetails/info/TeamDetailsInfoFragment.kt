package com.teamfinder.teamfinder.presentation.teamdetails.info

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamDetailsInfoBinding
import com.teamfinder.teamfinder.presentation.teamdetails.basic.TeamDetailsBasicFragment

class TeamDetailsInfoFragment :
    BaseFragment<FragmentTeamDetailsInfoBinding, TeamDetailsInfoViewModel>(
        FragmentTeamDetailsInfoBinding::inflate
    ) {
    override val viewModel: TeamDetailsInfoViewModel by viewModels()

    companion object {
        fun newInstance() = TeamDetailsInfoFragment()
    }


}