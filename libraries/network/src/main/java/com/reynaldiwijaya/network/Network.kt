package com.reynaldiwijaya.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object Network {

    fun okHttpClient(): OkHttpClient {
        val timeout = 120L
        return OkHttpClient.Builder()
            .connectTimeout(timeout, TimeUnit.SECONDS)
            .readTimeout(timeout, TimeUnit.SECONDS)
            .addInterceptor(createLoggingInterceptor())
            .build()
    }

    private fun createLoggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

}