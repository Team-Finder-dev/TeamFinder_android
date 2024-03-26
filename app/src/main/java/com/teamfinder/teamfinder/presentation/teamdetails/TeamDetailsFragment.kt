package com.teamfinder.teamfinder.presentation.teamdetails

import android.os.Bundle
import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamDetailsBinding

class TeamDetailsFragment :
    BaseFragment<FragmentTeamDetailsBinding, TeamDetailsViewModel>(FragmentTeamDetailsBinding::inflate) {

    override val viewModel by viewModels<TeamDetailsViewModel>()
    private  var tabMediator: TabLayoutMediator? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.teamDetailsViewpager.adapter = TeamDetailsViewPagerAdapter(this)

        attachTabMediator()
    }

    override fun onDestroyView() {
        tabMediator?.detach()
        super.onDestroyView()
    }

    private fun attachTabMediator() {
        tabMediator = TabLayoutMediator(
            binding.teamDetailsTabLayout,
            binding.teamDetailsViewpager
        ) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.basic)
                    tab.icon = AppCompatResources.getDrawable(requireContext(), R.drawable.ic_teamdetails_basic_tab)
                }
                1 -> {
                    tab.text = getString(R.string.info)
                    tab.icon = AppCompatResources.getDrawable(requireContext(), R.drawable.ic_teamdetails_info_tab)
                }
            }
        }
        tabMediator?.attach()
    }

}