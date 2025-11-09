package com.promni.folium.presentation.ui.utils

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
expect fun getWindowSizeClass(): WindowSizeClass

@Composable
fun getContentSidePadding(): Dp {
    val windowSizeClass = getWindowSizeClass()
    val sidePadding = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> 24.dp
        WindowWidthSizeClass.Medium -> 48.dp
        WindowWidthSizeClass.Expanded -> 96.dp
        else -> 24.dp
    }
    return sidePadding
}
