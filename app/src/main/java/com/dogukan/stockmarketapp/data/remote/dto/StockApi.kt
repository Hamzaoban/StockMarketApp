package com.dogukan.stockmarketapp.data.remote.dto

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(
        @Query("apikey") apikey : String
    ) : ResponseBody

    companion object{
        const val API_KEY = "AQVJIO3GPF7847J3"
        const val BASE_URL = "https://alphavantage.co"
    }
}