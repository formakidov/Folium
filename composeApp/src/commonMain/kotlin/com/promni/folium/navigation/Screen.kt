package com.promni.folium.navigation

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface Screen {
    @Serializable
    @SerialName("home")
    data object Home : Screen

    @Serializable
    @SerialName("project")
    data class ProjectDetail(val projectId: String) : Screen
}
