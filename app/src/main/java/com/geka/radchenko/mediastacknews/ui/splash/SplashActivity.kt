package com.geka.radchenko.mediastacknews.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import com.geka.radchenko.mediastacknews.R
import com.geka.radchenko.mediastacknews.base.BaseActivity
import com.geka.radchenko.mediastacknews.databinding.SplashActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity(R.layout.splash_activity) {
    private val binding: SplashActivityBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}