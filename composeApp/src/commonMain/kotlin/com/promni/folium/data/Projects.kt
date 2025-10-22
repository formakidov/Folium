package com.promni.folium.data

import com.promni.folium.localization.AppStrings
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
        role = AppStrings.OWNER_AND_DEVELOPER
    ),
    ProjectItemData(
        id = "mft",
        title = "Muscle Fatigue Tracker",
        platforms = listOf(Platform.Android, Platform.Ios, Platform.Desktop),
        shortDescription = "Fitness app",
        titleTextColor = null,
        imageRes = Res.drawable.preview_project_mft,
        containerColor = null,
        role = AppStrings.OWNER_AND_DEVELOPER,
    ),
    ProjectItemData(
        id = "covi",
        title = "COVI",
        platforms = listOf(Platform.Android),
        shortDescription = "Insurance app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = AppStrings.LEAD_SENIOR_ANDROID_DEVELOPER,
    ),
    ProjectItemData(
        id = "tarot",
        title = "Aesthetic Tarot",
        platforms = listOf(Platform.Android),
        shortDescription = "Tarot app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = AppStrings.OWNER_AND_DEVELOPER,
    ),
    ProjectItemData(
        id = "bevrage",
        title = "bevRAGE",
        platforms = listOf(Platform.Android),
        shortDescription = "Cashback app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = AppStrings.MIDDLE_ANDROID_DEVELOPER,
    ),
    ProjectItemData(
        id = "gymboom",
        title = "GymBoom",
        platforms = listOf(Platform.Android),
        shortDescription = "Fitness app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = AppStrings.MIDDLE_ANDROID_DEVELOPER,
    ),
    ProjectItemData(
        id = "ipdigital",
        title = "IpDigital",
        platforms = listOf(Platform.Android),
        shortDescription = "Remote control app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = AppStrings.JUNIOR_ANDROID_DEVELOPER,
    ),
    ProjectItemData(
        id = "litepdf",
        title = "Lite PDF Reader",
        platforms = listOf(Platform.Android),
        shortDescription = "PDF reader app",
        titleTextColor = null,
        imageRes = null,
        containerColor = null,
        role = AppStrings.JUNIOR_ANDROID_DEVELOPER,
    ),
)
