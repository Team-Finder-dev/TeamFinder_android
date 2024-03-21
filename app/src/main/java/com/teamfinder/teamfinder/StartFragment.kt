package com.teamfinder.teamfinder

import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentStartBinding
import javax.inject.Inject

// Test
class StartFragment : BaseFragment<FragmentStartBinding, BaseViewModel>(FragmentStartBinding::inflate) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    override lateinit var viewModel: BaseViewModel

    override fun onStart() {
        App.component.inject(this)
        viewModel = ViewModelProvider(viewModelStore, viewModelFactory)[BaseViewModel::class.java]
        super.onStart()
        Toast.makeText(requireContext(), viewModel.touch(), Toast.LENGTH_LONG).show()
    }
}
//