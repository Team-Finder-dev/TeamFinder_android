package com.teamfinder.teamfinder.presentation.searchscreen

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentSearchBinding

class SearchFragment :
    BaseFragment<FragmentSearchBinding, SearchViewModel>(FragmentSearchBinding::inflate) {

    override val viewModel: SearchViewModel by lazy {
        ViewModelProvider(viewModelStore, (requireActivity() as MainActivity).factory)[SearchViewModel::class.java]
    }

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
