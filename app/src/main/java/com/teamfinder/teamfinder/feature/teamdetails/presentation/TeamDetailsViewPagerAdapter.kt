package com.teamfinder.teamfinder.feature.teamdetails.presentation

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.teamfinder.teamfinder.feature.teamdetails.presentation.basic.TeamDetailsBasicFragment
import com.teamfinder.teamfinder.feature.teamdetails.presentation.info.TeamDetailsInfoFragment

private const val FRAGMENT_QTY = 2

class TeamDetailsViewPagerAdapter(parentFragment: Fragment) : FragmentStateAdapter(parentFragment) {
    override fun getItemCount(): Int = FRAGMENT_QTY

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TeamDetailsBasicFragment.newInstance()
            else -> TeamDetailsInfoFragment.newInstance()
        }
    }
}