package com.reynaldiwijaya.data.di

import com.reynaldiwijaya.data.service.NetworkService
import com.reynaldiwijaya.network.BuildConfig
import com.reynaldiwijaya.phoenix.libs.ApiService
import com.reynaldiwijaya.network.Network.okHttpClient
import org.koin.dsl.module

val dataModule = module {
    single { ApiService.createService(NetworkService::class.java, okHttpClient(), "https://www.thesportsdb.com/") }
}