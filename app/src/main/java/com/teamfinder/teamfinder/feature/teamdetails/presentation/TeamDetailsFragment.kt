package com.teamfinder.teamfinder.feature.teamdetails.presentation

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamDetailsBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.searchscreen.presentation.SearchViewModel
import com.teamfinder.teamfinder.feature.teamdetails.di.DaggerTeamDetailsComponent

class TeamDetailsFragment :
    BaseFragment<FragmentTeamDetailsBinding, TeamDetailsViewModel>(FragmentTeamDetailsBinding::inflate) {

    override val viewModel by injectViewModel<TeamDetailsViewModel>()
    override fun diComponent(): ScreenComponent = DaggerTeamDetailsComponent.create()


    private var tabMediator: TabLayoutMediator? = null

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
                    tab.icon = AppCompatResources.getDrawable(
                        requireContext(),
                        R.drawable.ic_teamdetails_basic_tab
                    )
                }

                1 -> {
                    tab.text = getString(R.string.info)
                    tab.icon = AppCompatResources.getDrawable(
                        requireContext(),
                        R.drawable.ic_teamdetails_info_tab
                    )
                }
            }
        }
        tabMediator?.attach()
        removeTabsIconMargins()
        binding.teamDetailsTabLayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(p0: TabLayout.Tab?) {
                removeTabsIconMargins()
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) { }

            override fun onTabReselected(p0: TabLayout.Tab?) { }

        })
    }

    private fun removeTabsIconMargins() {
        for (i in 0..binding.teamDetailsTabLayout.tabCount) {
            val params =
                binding.teamDetailsTabLayout.getTabAt(i)?.view?.getChildAt(0)?.layoutParams as LinearLayout.LayoutParams?
            params?.bottomMargin = 0
            binding.teamDetailsTabLayout.getTabAt(i)?.view?.getChildAt(0)?.layoutParams = params
        }
    }

}