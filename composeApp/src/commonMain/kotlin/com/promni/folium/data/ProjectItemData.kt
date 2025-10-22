package com.promni.folium.data

import androidx.compose.ui.graphics.Color
import com.promni.folium.localization.AppStrings
import com.promni.folium.localization.AppStrings.OWNER_AND_DEVELOPER
import com.promni.folium.localization.AppStringsId
import org.jetbrains.compose.resources.DrawableResource

data class ProjectItemData(
    val id: String,
    val title: String,
    val platforms: List<Platform>,
    val shortDescription: String,
    val role: AppStringsId,
    val titleTextColor: Color? = null,
    val imageRes: DrawableResource? = null,
    val containerColor: Color? = null
)
