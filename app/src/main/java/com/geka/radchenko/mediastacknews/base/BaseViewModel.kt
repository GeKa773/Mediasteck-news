package com.geka.radchenko.mediastacknews.base

import androidx.lifecycle.ViewModel
import com.geka.radchenko.mediastacknews.repository.Repository

abstract class BaseViewModel(private val repository: Repository) : ViewModel() {
    private val TAG by lazy { javaClass.simpleName }
}