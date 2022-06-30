package com.geka.radchenko.mediastacknews.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.geka.radchenko.mediastacknews.R
import com.geka.radchenko.mediastacknews.base.BaseFragment
import com.geka.radchenko.mediastacknews.databinding.NewsFragmentBinding
import com.geka.radchenko.mediastacknews.ui.news.viewmodel.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsFragment :
    BaseFragment<NewsFragmentBinding>(R.layout.news_fragment, NewsFragmentBinding::inflate) {
    private val TAG by lazy { javaClass.simpleName }
    private val viewModel by lazy {
        ViewModelProvider(this)[NewsViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
}