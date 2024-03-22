package com.teamfinder.teamfinder

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentStartBinding

// Test
class StartFragment : BaseFragment<FragmentStartBinding, TestViewModel>(FragmentStartBinding::inflate) {

    override lateinit var viewModel: TestViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = (requireActivity() as MainActivity).viewModelFactory
        viewModel = ViewModelProvider(viewModelStore, factory)[TestViewModel::class.java]
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(requireContext(), viewModel.touch(), Toast.LENGTH_LONG).show()
    }
}