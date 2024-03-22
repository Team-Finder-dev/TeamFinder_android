package com.teamfinder.teamfinder.presentation.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentContactsBinding

class ContactsFragment : BaseFragment<FragmentContactsBinding, ContactsViewModel>(
    FragmentContactsBinding::inflate
) {

    override lateinit var viewModel: ContactsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val factory = (requireActivity() as MainActivity).viewModelFactory
        viewModel = ViewModelProvider(viewModelStore, factory)[ContactsViewModel::class.java]

        return super.onCreateView(inflater, container, savedInstanceState)
    }
}