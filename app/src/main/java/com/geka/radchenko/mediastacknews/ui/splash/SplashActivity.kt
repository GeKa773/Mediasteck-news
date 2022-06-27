package com.geka.radchenko.mediastacknews.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
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

        val testAdapter = TestAdapter()

        binding!!.rv.apply {
            adapter = testAdapter
            layoutManager = LinearLayoutManager(this@SplashActivity)

        }





        testAdapter.submitList(dummyContent())

        setContentView(binding!!.root)
    }

    private fun dummyContent(): MutableList<TestAdapter.TestData> {
        return arrayListOf<TestAdapter.TestData>().apply {
            for (i in 0..20) {
                add(TestAdapter.TestData(i, "Geka", "Radchenko"))
            }
        }
    }

}