package com.geka.radchenko.mediastacknews.prefs

import android.content.Context
import com.geka.radchenko.mediastacknews.util.add
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesImpl @Inject constructor(context: Context) : PreferencesManager {
    companion object {
        private const val NAME = "sPref"
        private const val FIRST_START = "first_start"
    }

    private val prefs = context.getSharedPreferences(NAME, Context.MODE_PRIVATE)
    override var firstStart: Boolean
        get() = prefs.getBoolean(FIRST_START, true)
        set(value) {
            prefs.add(FIRST_START, value)
        }
}