package com.geka.radchenko.mediastacknews.api.pojo

import androidx.annotation.Keep

@Keep
data class ResponsePagination<Data>(
    val pagination: PaginationData,
    val data: Data
)


