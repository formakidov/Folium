package com.promni.folium.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screen {
    @Serializable
    data object Home : Screen

    @Serializable
    data class ProjectDetail(val projectId: String) : Screen
}
