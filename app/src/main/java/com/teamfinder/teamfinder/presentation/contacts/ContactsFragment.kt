package com.teamfinder.teamfinder.presentation.contacts

import androidx.lifecycle.ViewModelProvider
import com.teamfinder.teamfinder.MainActivity
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentContactsBinding

class ContactsFragment : BaseFragment<FragmentContactsBinding, ContactsViewModel>(
    FragmentContactsBinding::inflate
) {
    override val viewModel: ContactsViewModel by lazy {
        ViewModelProvider(viewModelStore, (requireActivity() as MainActivity).factory)[ContactsViewModel::class.java]
    }
}