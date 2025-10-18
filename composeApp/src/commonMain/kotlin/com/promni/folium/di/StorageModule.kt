package com.promni.folium.di

import com.promni.folium.data.userPreferencesStore
import org.koin.dsl.module

val storageModule = module {
    single { userPreferencesStore }
}
