package com.promni.folium.data

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource

data class ProjectItemData(
    val id: String,
    val title: String,
    val platforms: List<Platform>,
    val shortDescription: String,
    val role: String,
    val titleTextColor: Color? = null,
    val imageRes: DrawableResource? = null,
    val containerColor: Color? = null
)
