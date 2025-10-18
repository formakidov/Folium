package com.promni.folium

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.promni.folium.di.appModules
import org.koin.core.context.startKoin

fun main() = application {
    startKoin { modules(appModules()) }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Portare Folium",
    ) {
        App(
            darkTheme = isSystemInDarkTheme(),
            dynamicColor = false,
        )
    }
}
