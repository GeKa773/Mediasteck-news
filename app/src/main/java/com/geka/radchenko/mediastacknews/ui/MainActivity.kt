package com.geka.radchenko.mediastacknews.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.geka.radchenko.mediastacknews.R
import com.geka.radchenko.mediastacknews.base.BaseActivity
import com.geka.radchenko.mediastacknews.databinding.MainActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity(R.layout.main_activity) {
    private val TAG by lazy { javaClass.simpleName }
    private lateinit var binding: MainActivityBinding
    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}