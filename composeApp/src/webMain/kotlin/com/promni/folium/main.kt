package com.promni.folium

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import androidx.navigation.ExperimentalBrowserHistoryApi
import androidx.navigation.bindToBrowserNavigation
import com.promni.folium.di.appModules
import org.koin.core.context.startKoin

@OptIn(ExperimentalComposeUiApi::class, ExperimentalBrowserHistoryApi::class)
fun main() {
    startKoin { modules(appModules()) }
    ComposeViewport {
        App(
            darkTheme = isSystemInDarkTheme(),
            dynamicColor = false,
            onNavHostReady = { it.bindToBrowserNavigation() }
        )
    }
}
