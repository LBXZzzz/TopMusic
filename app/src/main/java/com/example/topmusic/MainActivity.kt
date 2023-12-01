package com.example.topmusic

import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.common.app.Api
import com.example.common.net.request
import com.example.topmusic.databinding.ActivityMainBinding

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : com.example.common.base.BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController
    override val layout: Int
        get() = R.layout.activity_main

    override fun onActivityCreate(savedInstanceState: Bundle?) {
        initNav()

    }

    //初始化底部导航栏
    private fun initNav() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_top_music_host) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.navBt, navController)
    }


}