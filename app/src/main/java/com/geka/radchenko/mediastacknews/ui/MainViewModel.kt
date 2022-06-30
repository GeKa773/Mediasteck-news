package com.geka.radchenko.mediastacknews.ui

import com.geka.radchenko.mediastacknews.base.BaseViewModel
import com.geka.radchenko.mediastacknews.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(repository: Repository) : BaseViewModel(repository) {
    private val TAG by lazy { javaClass.simpleName }
}