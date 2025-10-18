package com.promni.folium.data.model

import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.DrawableResource
import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.ic_de
import portare_folium.composeapp.generated.resources.ic_gb

@Serializable
enum class Language(
    val code: String,
    val displayName: String,
    val icon: DrawableResource
) {
    EN("en", "English", Res.drawable.ic_gb),
    DE("de", "Deutsch", Res.drawable.ic_de)
}
