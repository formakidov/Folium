package com.promni.folium.data

import com.promni.folium.data.model.UserPreferences
import io.github.xxfast.kstore.KStore

const val applicationId = "com.promni.folium"

expect val userPreferencesStore: KStore<UserPreferences>
