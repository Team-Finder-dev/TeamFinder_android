package com.teamfinder.teamfinder.presentation.registration

import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentRegistrationBinding

class RegistrationFragment :
    BaseFragment<FragmentRegistrationBinding, RegistrationViewModel>(FragmentRegistrationBinding::inflate) {
    override val viewModel by viewModels<RegistrationViewModel>()

    override fun subscribe() {
        super.subscribe()
    }
}