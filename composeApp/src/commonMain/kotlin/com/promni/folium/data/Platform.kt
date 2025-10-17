package com.promni.folium.data

import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.chip_icon_android
import portare_folium.composeapp.generated.resources.chip_icon_desktop
import portare_folium.composeapp.generated.resources.chip_icon_ios
import portare_folium.composeapp.generated.resources.chip_icon_web
import org.jetbrains.compose.resources.DrawableResource

enum class Platform(val displayName: String, val icon: DrawableResource) {
    Android("Android", Res.drawable.chip_icon_android),
    Ios("iOS", Res.drawable.chip_icon_ios),
    Desktop("Desktop", Res.drawable.chip_icon_desktop),
    Web("Web", Res.drawable.chip_icon_web),
}
