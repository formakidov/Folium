package com.promni.folium.data

import folium.composeapp.generated.resources.Res
import folium.composeapp.generated.resources.chip_icon_android
import folium.composeapp.generated.resources.chip_icon_desktop
import folium.composeapp.generated.resources.chip_icon_ios
import folium.composeapp.generated.resources.chip_icon_web
import org.jetbrains.compose.resources.DrawableResource

enum class Platform(val displayName: String, val icon: DrawableResource) {
    Android("Android", Res.drawable.chip_icon_android),
    Ios("iOS", Res.drawable.chip_icon_ios),
    Desktop("Desktop", Res.drawable.chip_icon_desktop),
    Web("Web", Res.drawable.chip_icon_web),
}
