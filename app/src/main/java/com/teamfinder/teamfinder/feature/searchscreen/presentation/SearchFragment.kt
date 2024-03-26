package com.teamfinder.teamfinder.feature.searchscreen.presentation

import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentSearchBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.searchscreen.di.DaggerSearchComponent

class SearchFragment :
    BaseFragment<FragmentSearchBinding, SearchViewModel>(FragmentSearchBinding::inflate) {

    override val viewModel by injectViewModel<SearchViewModel>()
    override fun diComponent(): ScreenComponent = DaggerSearchComponent.create()

    private lateinit var navController: NavController

    override fun initViews() {
        super.initViews()
        initBottomNavigationBar()
    }

    private fun initBottomNavigationBar() {
        navController = (childFragmentManager.findFragmentById(R.id.container_view) as NavHostFragment).navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}
