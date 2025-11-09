package com.promni.folium.data

import androidx.compose.ui.graphics.Color
import com.promni.folium.localization.AppStringsId
import org.jetbrains.compose.resources.DrawableResource

data class ProjectItemData(
    val id: String,
    val order: Int,
    val title: String,
    val platforms: List<Platform>,
    val shortDescription: String,
    val role: AppStringsId,
    val titleTextColor: Color? = null,
    val imageRes: DrawableResource? = null,
    val images: List<DrawableResource> = emptyList(),
    val fullDescription: AppStringsId,
)
