package com.promni.folium

import android.app.Application
import com.promni.folium.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class FoliumApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@FoliumApplication)
        }
    }
}
