package com.teamfinder.teamfinder.feature.teamdetails.presentation.info

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamDetailsInfoBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.teamdetails.di.DaggerTeamDetailsBasicComponent
import com.teamfinder.teamfinder.feature.teamdetails.di.DaggerTeamDetailsInfoComponent
import com.teamfinder.teamfinder.feature.teamdetails.presentation.basic.TeamDetailsBasicFragment

class TeamDetailsInfoFragment :
    BaseFragment<FragmentTeamDetailsInfoBinding, TeamDetailsInfoViewModel>(
        FragmentTeamDetailsInfoBinding::inflate
    ) {
    override val viewModel: TeamDetailsInfoViewModel by viewModels()
    override fun diComponent(): ScreenComponent = DaggerTeamDetailsInfoComponent.create()

    companion object {
        fun newInstance() = TeamDetailsInfoFragment()
    }


}