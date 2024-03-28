package com.teamfinder.teamfinder

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.fragment.NavHostFragment
import com.teamfinder.teamfinder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHostFragment.navController

        // Change color of status bar icons
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.registrationFragment -> setLightStatusBarIconsColor()
                else -> removeLightStatusBarIconsColor()
            }
        }
    }

    private fun setLightStatusBarIconsColor() {
        WindowInsetsControllerCompat(window, binding.root).isAppearanceLightStatusBars = true
    }

    private fun removeLightStatusBarIconsColor() {
        WindowInsetsControllerCompat(window, binding.root).isAppearanceLightStatusBars = false
    }
}