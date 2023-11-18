package com.example.topmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.common.base.BaseActivity
import com.example.topmusic.databinding.ActivityMainBinding


class MainActivity : com.example.common.base.BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController
    override val layout: Int
        get() = R.layout.activity_main

    override fun onActivityCreate(savedInstanceState: Bundle?) {
        initNav()
    }

    private fun initNav() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_top_music_host) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.navBt, navController)
    }


}