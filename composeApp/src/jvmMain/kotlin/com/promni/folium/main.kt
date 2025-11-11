package com.promni.folium

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.promni.folium.di.appModules
import com.promni.folium.navigation.ExternalUriHandler
import org.koin.core.context.startKoin
import java.awt.Desktop

fun main(args: Array<String>) {
    handleInitialUri(args)

    application {
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
}

private fun handleInitialUri(args: Array<String>) {
    if (System.getProperty("os.name").indexOf("Mac") > -1) {
        Desktop.getDesktop().setOpenURIHandler { uri ->
            ExternalUriHandler.onNewUri(uri.uri.toString())
        }
    } else {
        ExternalUriHandler.onNewUri(args.getOrNull(0).toString())
    }
}
