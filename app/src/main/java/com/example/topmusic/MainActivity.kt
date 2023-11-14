package com.example.topmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.base.BaseActivity
import com.example.topmusic.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layout: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.ppp.text = "你好"
    }
}