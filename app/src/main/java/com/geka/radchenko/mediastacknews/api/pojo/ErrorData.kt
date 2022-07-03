package com.geka.radchenko.mediastacknews.api.pojo

import androidx.annotation.Keep

@Keep
data class ErrorData(val code: String, val message: String, val context: DataError)

@Keep
data class DataError(val date: List<String>)
