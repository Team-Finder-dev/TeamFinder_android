package com.teamfinder.teamfinder.feature.teamdetails.presentation.basic

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamDetailsBasicBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.teamdetails.di.DaggerTeamDetailsBasicComponent
import com.teamfinder.teamfinder.feature.teamdetails.di.DaggerTeamDetailsComponent

class TeamDetailsBasicFragment :
    BaseFragment<FragmentTeamDetailsBasicBinding, TeamDetailsBasicViewModel>(
        FragmentTeamDetailsBasicBinding::inflate
    ) {

    override val viewModel: TeamDetailsBasicViewModel by viewModels()
    override fun diComponent(): ScreenComponent = DaggerTeamDetailsBasicComponent.create()

    companion object {
        fun newInstance() = TeamDetailsBasicFragment()
    }


}