package com.geka.radchenko.mediastacknews.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.geka.radchenko.mediastacknews.R
import com.geka.radchenko.mediastacknews.base.BaseActivity
import com.geka.radchenko.mediastacknews.databinding.SplashActivityBinding
import com.geka.radchenko.mediastacknews.ui.MainActivity
import com.geka.radchenko.mediastacknews.ui.splash.viewmodel.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity(R.layout.splash_activity) {
    private lateinit var binding: SplashActivityBinding
    private val viewModel by lazy {
        ViewModelProvider(this)[SplashViewModel::class.java]
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 2000L)
    }
}