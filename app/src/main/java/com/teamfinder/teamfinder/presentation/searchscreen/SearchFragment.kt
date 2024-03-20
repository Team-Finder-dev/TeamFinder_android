package com.teamfinder.teamfinder.presentation.searchscreen

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentSearchBinding

class SearchFragment :
    BaseFragment<FragmentSearchBinding, SearchViewModel>(FragmentSearchBinding::inflate) {
    override val viewModel by viewModels<SearchViewModel>()
}