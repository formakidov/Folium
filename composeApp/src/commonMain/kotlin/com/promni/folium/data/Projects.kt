package com.promni.folium.data

import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.preview_project_mft

val projects = listOf(
    ProjectItemData(
        id = "1",
        title = "Portare Folium",
        platforms = listOf(Platform.Android, Platform.Ios, Platform.Desktop, Platform.Web),
        shortDescription = "Portfolio app",
        titleTextColor = null,
        backgroundImage = Res.drawable.preview_project_mft,
        containerColor = null
    ),
    ProjectItemData(
        id = "2",
        title = "Muscle Fatigue Tracker",
        platforms = listOf(Platform.Android, Platform.Ios, Platform.Desktop),
        shortDescription = "Fitness app",
        titleTextColor = null,
        backgroundImage = Res.drawable.preview_project_mft,
        containerColor = null
    ),
    ProjectItemData(
        id = "3",
        title = "COVI",
        platforms = listOf(Platform.Android),
        shortDescription = "Insurance app",
        titleTextColor = null,
        backgroundImage = Res.drawable.preview_project_mft,
        containerColor = null
    ),
    ProjectItemData(
        id = "4",
        title = "Aesthetic Tarot",
        platforms = listOf(Platform.Android),
        shortDescription = "Tarot app",
        titleTextColor = null,
        backgroundImage = Res.drawable.preview_project_mft,
        containerColor = null
    ),
)
