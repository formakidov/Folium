package com.promni.folium.data.model

import kotlinx.serialization.Serializable

@Serializable
data class UserPreferences(
    val language: Language = Language.EN
)
