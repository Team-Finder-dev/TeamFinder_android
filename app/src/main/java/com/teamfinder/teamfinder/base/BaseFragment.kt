package com.teamfinder.teamfinder.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.launch

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

/**
 * Base fragment, inheritance from this fragment makes whole fragments the same implementation and construction.
 * Also this fragment inits viewBinding by default.
 */
abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(
    private val inflate: Inflate<VB>,
) : Fragment() {

    private var _binding: VB? = null
    protected val binding: VB get() = _binding!!

    abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lifecycleScope.launch {
            viewModel.navigationEvents.collect { event ->
                event?.let { navigate(it) }
            }
        }

        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        subscribe()
    }

    open fun initViews() = Unit

    open fun subscribe() = Unit

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    protected open fun navigate(fragment: Fragment) {
        findNavController().navigate(fragment.id)
    }
}
