package com.teamfinder.teamfinder.presentation.searchscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    override lateinit var viewModel: SearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val factory = (requireActivity() as MainActivity).viewModelFactory
        viewModel = ViewModelProvider(viewModelStore, factory)[SearchViewModel::class.java]

        return super.onCreateView(inflater, container, savedInstanceState)
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
