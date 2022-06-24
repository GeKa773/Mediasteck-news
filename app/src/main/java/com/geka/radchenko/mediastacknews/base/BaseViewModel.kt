package com.geka.radchenko.mediastacknews.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel() : ViewModel() {
    private val TAG by lazy { javaClass.simpleName }
}