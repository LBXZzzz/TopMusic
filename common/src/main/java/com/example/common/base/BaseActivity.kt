package com.example.common.base;

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.common.ACTION_FINISH
import com.example.common.ACTION_RECREATE

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {

    /**
     * 界面的 layout ID
     *
     * @LayoutRes
     */
    protected abstract val layout: Int

    private var _binding: VB? = null

    protected val binding: VB get() = _binding!!

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewDataBinding()
        onActivityCreate(savedInstanceState)
    }

    public abstract fun onActivityCreate(savedInstanceState: Bundle?)

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