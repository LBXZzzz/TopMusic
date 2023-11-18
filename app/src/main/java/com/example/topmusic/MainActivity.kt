package com.example.topmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.base.BaseActivity
import com.example.topmusic.databinding.ActivityMainBinding


class MainActivity : com.example.common.base.BaseActivity<ActivityMainBinding>() {
    override val layout: Int
        get() = R.layout.activity_main

    override fun onActivityCreate(savedInstanceState: Bundle?) {
        binding.ppp.text = "你好"
    }

}