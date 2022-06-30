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
class NewsFragment : BaseFragment(R.layout.news_fragment) {
    private val TAG by lazy { javaClass.simpleName }
    private val viewModel by lazy {
        ViewModelProvider(this)[NewsViewModel::class.java]
    }
    private var _binding: NewsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = NewsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}