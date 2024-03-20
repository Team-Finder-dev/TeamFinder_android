package com.teamfinder.teamfinder.presentation.registration

import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentRegistrationBinding

class RegistrationFragment :
    BaseFragment<FragmentRegistrationBinding, RegistrationViewModel>(FragmentRegistrationBinding::inflate) {
    override val viewModel by viewModels<RegistrationViewModel>()

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