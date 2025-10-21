package com.promni.folium.data

import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.preview_project_mft

val projects = listOf(
    ProjectItemData(
        id = "folium",
        title = "Portare Folium",
        platforms = listOf(Platform.Android, Platform.Ios, Platform.Desktop, Platform.Web),
        shortDescription = "Portfolio app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = "Owner & Developer"
    ),
    ProjectItemData(
        id = "mft",
        title = "Muscle Fatigue Tracker",
        platforms = listOf(Platform.Android, Platform.Ios, Platform.Desktop),
        shortDescription = "Fitness app",
        titleTextColor = null,
        imageRes = Res.drawable.preview_project_mft,
        containerColor = null,
        role = "Owner & Developer",
    ),
    ProjectItemData(
        id = "covi",
        title = "COVI",
        platforms = listOf(Platform.Android),
        shortDescription = "Insurance app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = "Lead / Senior Android Developer"
    ),
    ProjectItemData(
        id = "tarot",
        title = "Aesthetic Tarot",
        platforms = listOf(Platform.Android),
        shortDescription = "Tarot app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = "Owner & Developer",
    ),
)
