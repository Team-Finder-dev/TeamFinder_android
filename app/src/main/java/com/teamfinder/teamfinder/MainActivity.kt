package com.teamfinder.teamfinder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Test
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, StartFragment(), null)
            .commit()
    }
}