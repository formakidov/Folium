package com.promni.folium

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.promni.folium.navigation.AppNavigation
import com.promni.folium.presentation.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    onNavHostReady: suspend (NavController) -> Unit = {}
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        AppNavigation(onNavHostReady = onNavHostReady)
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    )
}
