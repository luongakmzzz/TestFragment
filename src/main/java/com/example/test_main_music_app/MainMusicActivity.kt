package com.example.test_main_music_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.test_main_music_app.databinding.FragmentFirstBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.nio.file.Files.find

class MainMusicActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_music)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)
    }
}