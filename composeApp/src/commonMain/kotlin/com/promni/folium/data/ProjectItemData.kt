package com.promni.folium.data

import androidx.compose.ui.graphics.Color
import com.promni.folium.localization.AppStringsId

data class ProjectItemData(
    val id: String,
    val order: Int,
    val title: String,
    val platforms: List<Platform>,
    val shortDescription: AppStringsId? = null,
    val role: AppStringsId,
    val titleTextColor: Color? = null,
    val previewImage: String? = null,
    val images: List<String> = emptyList(),
    val fullDescription: AppStringsId,
    val appLink: String? = null,
    val projectLink: String? = null,
    val sourceCodeLink: String? = null,
    val devPeriod: String? = null,
    val company: AppStringsId? = null,
)
