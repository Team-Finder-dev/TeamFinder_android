package com.teamfinder.teamfinder.presentation.teamssearch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentTeamsSearchBinding

class TeamsSearchFragment : BaseFragment<FragmentTeamsSearchBinding, TeamsViewModel>(
        FragmentTeamsSearchBinding::inflate
) {
    override lateinit var viewModel: TeamsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val factory = (requireActivity() as MainActivity).viewModelFactory
        viewModel = ViewModelProvider(viewModelStore, factory)[TeamsViewModel::class.java]

        return super.onCreateView(inflater, container, savedInstanceState)
    }

}