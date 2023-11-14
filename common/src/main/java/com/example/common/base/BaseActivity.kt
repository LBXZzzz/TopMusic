package com.example.common.base;

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {

    /**
     * 界面的 layout ID
     *
     * @LayoutRes
     */
    protected abstract val layout: Int

    private var _binding: VB? = null

    protected val binding: VB get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewDataBinding()
    }

    private fun initViewDataBinding() {
        _binding = DataBindingUtil.setContentView(this, layout)
        binding.lifecycleOwner = this
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        val action = intent?.action ?: return
        when (action) {
            ACTION_RECREATE -> {
                recreate()
            }

            ACTION_FINISH -> {
                finish()
            }
        }
    }


}