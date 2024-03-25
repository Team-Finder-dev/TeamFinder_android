package com.teamfinder.teamfinder.presentation.contacts

import android.util.Log
import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentContactsBinding

class ContactsFragment :
    BaseFragment<FragmentContactsBinding, ContactsViewModel>(FragmentContactsBinding::inflate) {
    override val viewModel by viewModels<ContactsViewModel>()
}