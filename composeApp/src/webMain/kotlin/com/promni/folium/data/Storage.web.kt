package com.promni.folium.data

import com.promni.folium.data.model.UserPreferences
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.storage.storeOf

actual val userPreferencesStore: KStore<UserPreferences> by lazy {
    storeOf(key = "saved", default = UserPreferences())
}
