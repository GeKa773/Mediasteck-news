package com.geka.radchenko.mediastacknews.base

import androidx.fragment.app.Fragment

open class BaseFragment(layoutId: Int) : Fragment(layoutId) {
    val baseActivity
        get() = requireActivity() as BaseActivity

    fun onBackPressed() {
        baseActivity.onBackPressed()
    }
}