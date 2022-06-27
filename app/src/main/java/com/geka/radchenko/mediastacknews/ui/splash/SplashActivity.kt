package com.geka.radchenko.mediastacknews.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.geka.radchenko.mediastacknews.R
import com.geka.radchenko.mediastacknews.base.BaseActivity
import com.geka.radchenko.mediastacknews.databinding.SplashActivityBinding
import com.geka.radchenko.mediastacknews.ui.splash.viewmodel.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity(R.layout.splash_activity) {
    private var binding: SplashActivityBinding? = null
    private val viewModel by lazy {
        ViewModelProvider(this)[SplashViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashActivityBinding.inflate(layoutInflater)



        setContentView(binding!!.root)
    }
}