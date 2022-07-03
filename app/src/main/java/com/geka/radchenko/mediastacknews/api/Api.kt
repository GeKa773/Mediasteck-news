package com.geka.radchenko.mediastacknews.api

import com.geka.radchenko.mediastacknews.BuildConfig
import com.geka.radchenko.mediastacknews.api.pojo.NewsData
import com.geka.radchenko.mediastacknews.api.pojo.ResponsePagination
import com.geka.radchenko.mediastacknews.api.pojo.SourcesData
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {
    @POST("news")
    fun getNews(
        @Query("access_key ") key: String = BuildConfig.API_ACCESS_KEY,
        @Query("sources") sources: String? = null,
        @Query("categories") categories: String? = null,
        @Query("countries") countries: String? = null,
        @Query("languages") languages: String? = null,
        @Query("keywords") keywords: String? = null,
        @Query("date") date: String? = null,
        @Query("sort") sort: String? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null,
    ): ResponsePagination<NewsData>?

    @POST("news")
    fun getHistoryNews(
        @Query("access_key ") key: String = BuildConfig.API_ACCESS_KEY,
        @Query("date") date: String,
        @Query("sources") sources: String? = null,
        @Query("categories") categories: String? = null,
        @Query("countries") countries: String? = null,
        @Query("languages") languages: String? = null,
        @Query("keywords") keywords: String? = null,
        @Query("sort") sort: String? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null,
    ): ResponsePagination<NewsData>?

    @POST("sources")
    fun getNewsSources(
        @Query("access_key ") key: String = BuildConfig.API_ACCESS_KEY,
        @Query("search ") search: String,
        @Query("countries") countries: String? = null,
        @Query("languages") languages: String? = null,
        @Query("categories") categories: String? = null,
        @Query("limit") limit: Int? = null,
        @Query("offset") offset: Int? = null,
    ): ResponsePagination<SourcesData>?
}