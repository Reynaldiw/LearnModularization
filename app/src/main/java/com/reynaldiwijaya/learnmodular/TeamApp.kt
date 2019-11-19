package com.reynaldiwijaya.learnmodular

import android.app.Application
import com.reynaldiwijaya.data.di.dataModule
import com.reynaldiwijaya.teams.di.teamsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TeamApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@TeamApp)
            modules(listOf(
                dataModule,
                teamsModule
            ))
        }
    }
}