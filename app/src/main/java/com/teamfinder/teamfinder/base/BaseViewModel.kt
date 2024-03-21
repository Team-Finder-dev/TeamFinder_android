package com.teamfinder.teamfinder.base

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.navigation.NavEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel : ViewModel(), NavEvent {
    private val _navigationEvents = MutableStateFlow<Fragment?>(null)
    val navigationEvents: StateFlow<Fragment?>
        get() =  _navigationEvents

    override fun navigate(fragment: Fragment) {
        _navigationEvents.value = fragment
    }
}