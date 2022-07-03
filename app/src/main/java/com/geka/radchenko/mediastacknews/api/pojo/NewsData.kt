package com.geka.radchenko.mediastacknews.api.pojo

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class NewsData(
    val id: Int,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val source: String,
    val image: String,
    val category: String,
    val language: String,
    val country: String,
    @SerializedName("published_at")
    val publishedAt: String,
) {
}