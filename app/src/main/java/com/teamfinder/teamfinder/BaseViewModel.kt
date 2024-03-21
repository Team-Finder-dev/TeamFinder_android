package com.teamfinder.teamfinder

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class BaseViewModel @Inject constructor() : ViewModel() {

    // Test
    fun touch(): String {
        return "Touched"
    }
}