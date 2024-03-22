package com.teamfinder.teamfinder.presentation.registration

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentRegistrationBinding

class RegistrationFragment :
    BaseFragment<FragmentRegistrationBinding, RegistrationViewModel>(FragmentRegistrationBinding::inflate) {

    override lateinit var viewModel: RegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val factory = (requireActivity() as MainActivity).viewModelFactory
        viewModel = ViewModelProvider(viewModelStore, factory)[RegistrationViewModel::class.java]

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun subscribe() {
        super.subscribe()
        clickListeners()
    }

    private fun clickListeners() = with(binding) {
        val listener = onClickListener()
        btnToSearchScreen.setOnClickListener(listener)
    }

    private fun onClickListener() = View.OnClickListener {
        with(binding) {
            when (it) {
                btnToSearchScreen -> findNavController().navigate(R.id.action_registrationFragment_to_searchFragment)
            }
        }
    }
}