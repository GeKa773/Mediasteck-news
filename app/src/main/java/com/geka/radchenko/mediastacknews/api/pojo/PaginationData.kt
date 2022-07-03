package com.geka.radchenko.mediastacknews.api.pojo

import androidx.annotation.Keep

@Keep
data class PaginationData(
    val limit: Int,
    val offset: Int,
    val count: Int,
    val total: Int,
) {
}