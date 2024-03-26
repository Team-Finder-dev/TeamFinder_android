package com.teamfinder.teamfinder.navigation

import androidx.fragment.app.Fragment

interface NavEvent {
    fun navigate(fragment: Fragment)
}