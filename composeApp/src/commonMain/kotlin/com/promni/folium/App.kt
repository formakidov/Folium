package com.promni.folium

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.promni.folium.data.projects
import com.promni.folium.presentation.ui.components.ProjectsCarousel
import com.promni.folium.presentation.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Surface {
            AboutMe()
            Projects()
            Skills()
            Contact()
        }
    }
}

@Composable
fun AboutMe() {
//    TODO("Not yet implemented")
}

@Composable
fun Skills() {
//    TODO("Not yet implemented")
}

@Composable
fun Contact() {
//    TODO("Not yet implemented")
}

@Composable
fun Projects() {
    ProjectsCarousel(items = projects)
}



@Preview
@Composable
fun AppAndroidPreview() {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    )
}
