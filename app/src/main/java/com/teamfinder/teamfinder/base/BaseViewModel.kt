package com.teamfinder.teamfinder.base

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.teamfinder.teamfinder.navigation.NavEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel : ViewModel(), NavEvent {
    protected val _state: MutableStateFlow<Any?> = MutableStateFlow(null)
    val state: StateFlow<Any?>
        get() = _state

    override fun navigate(fragment: Fragment) {
        // TODO добавить реализацию методоа
    }
}