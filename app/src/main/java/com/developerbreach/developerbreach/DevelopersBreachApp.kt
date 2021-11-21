package com.developerbreach.developerbreach

import android.app.Application
import timber.log.Timber

@Suppress("unused")
class DevelopersBreachApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}