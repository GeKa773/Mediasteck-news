package com.geka.radchenko.mediastacknews.api.pojo

import androidx.annotation.Keep

@Keep
data class SourcesData(
    val id: String,
    val name: String,
    val category: String,
    val country: String,
    val language: String,
    val url: String,
)