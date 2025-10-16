package com.promni.folium.data

import folium.composeapp.generated.resources.Res
import folium.composeapp.generated.resources.preview_project_mft
import folium.composeapp.generated.resources.test

val projects = listOf(
    ProjectItemData(
        id = "1",
        title = "COVI",
        platforms = listOf(Platform.Android),
        shortDescription = "Insurance app",
        titleTextColor = null,
        backgroundImage = Res.drawable.test,
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
        title = "Aesthetic Tarot",
        platforms = listOf(Platform.Android),
        shortDescription = "Tarot app",
        titleTextColor = null,
        backgroundImage = Res.drawable.test,
        containerColor = null
    ),
    ProjectItemData(
        id = "4",
        title = "Folium (you are here)",
        platforms = listOf(Platform.Android, Platform.Ios, Platform.Desktop, Platform.Web),
        shortDescription = "Portfolio app",
        titleTextColor = null,
        backgroundImage = Res.drawable.test,
        containerColor = null
    ),
)
