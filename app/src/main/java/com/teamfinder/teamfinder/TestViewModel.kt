package com.teamfinder.teamfinder

import com.teamfinder.teamfinder.base.BaseViewModel
import javax.inject.Inject

// Test
class TestViewModel @Inject constructor() : BaseViewModel() {

    // Test
    fun touch(): String {
        return "Touched"
    }
}