package com.teamfinder.teamfinder

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var baseViewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Test
        TeamFinderApp.component.inject(this)
        baseViewModel = ViewModelProvider(viewModelStore, viewModelFactory)[BaseViewModel::class.java]
        Toast.makeText(this, baseViewModel.touch(), Toast.LENGTH_SHORT).show()
    }
}