package com.teamfinder.teamfinder.feature.contacts.presntation

import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentContactsBinding
import com.teamfinder.teamfinder.di.ScreenComponent
import com.teamfinder.teamfinder.feature.contacts.di.DaggerContactsComponent

class ContactsFragment : BaseFragment<FragmentContactsBinding, ContactsViewModel>(
    FragmentContactsBinding::inflate
) {
    override val viewModel by injectViewModel<ContactsViewModel>()

    override fun diComponent(): ScreenComponent = DaggerContactsComponent.create()
}