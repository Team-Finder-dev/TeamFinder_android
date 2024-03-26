package com.teamfinder.teamfinder.feature.registration.presentation

import android.view.View
import androidx.navigation.fragment.findNavController
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentRegistrationBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.registration.di.DaggerRegistrationComponent

class RegistrationFragment :
    BaseFragment<FragmentRegistrationBinding, RegistrationViewModel>(FragmentRegistrationBinding::inflate) {

    override val viewModel by injectViewModel<RegistrationViewModel>()
    override fun diComponent(): ScreenComponent = DaggerRegistrationComponent.create()

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