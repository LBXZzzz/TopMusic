package com.example.topmusic.fragment

import android.os.Bundle
import com.example.common.base.BaseFragment
import com.example.topmusic.R
import com.example.topmusic.databinding.FragmentUserBinding

class UserFragment:BaseFragment<FragmentUserBinding>() {
    override val layoutId: Int
        get() = R.layout.fragment_user
    
    override fun onFragmentCreate(savedInstanceState: Bundle?) {

    }
}