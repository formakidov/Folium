package com.promni.folium.data

import com.promni.folium.data.model.UserPreferences
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.file.storeOf
import kotlinx.io.files.Path
import me.sujanpoudel.utils.paths.appDataDirectory

actual val userPreferencesStore: KStore<UserPreferences> by lazy {
  val directory = appDataDirectory(applicationId)
  val prefsFile = Path("$directory/user-preferences.json")
  storeOf(file = prefsFile, default = UserPreferences())
}
