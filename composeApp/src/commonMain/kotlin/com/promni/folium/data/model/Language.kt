package com.promni.folium.data.model

import kotlinx.serialization.Serializable

@Serializable
enum class Language(val code: String, val displayName: String) {
    EN("en", "English"),
    DE("de", "Deutsch")
}
