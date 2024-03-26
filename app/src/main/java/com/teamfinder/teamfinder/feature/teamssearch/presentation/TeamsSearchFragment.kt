package com.teamfinder.teamfinder.feature.teamssearch.presentation

import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamsSearchBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.teamssearch.di.DaggerTeamsSearchComponent

class TeamsSearchFragment : BaseFragment<FragmentTeamsSearchBinding, TeamsViewModel>(
    FragmentTeamsSearchBinding::inflate
) {
    override val viewModel by injectViewModel<TeamsViewModel>()
    override fun diComponent(): ScreenComponent = DaggerTeamsSearchComponent.create()
}