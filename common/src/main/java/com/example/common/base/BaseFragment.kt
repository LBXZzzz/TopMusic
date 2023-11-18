package com.example.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<VB : ViewDataBinding> : Fragment() {

    /**
     * 界面的 layout ID
     *
     * @LayoutRes
     */
    protected abstract val layoutId: Int
    private var _binding: VB? = null
    protected val binding get() = _binding!!


    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onFragmentCreate(savedInstanceState)
    }

    public abstract fun onFragmentCreate(savedInstanceState: Bundle?)

    //这个一定要写，不然可能导致内存泄漏
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}