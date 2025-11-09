package com.promni.folium.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
import androidx.navigation.toRoute
import com.promni.folium.presentation.ui.screen.MainScreen
import com.promni.folium.presentation.ui.screen.ProjectDetailScreen

private const val basePath = "https://formakidov.github.io/Folium/"

@Composable
fun AppNavigation(
    onNavHostReady: suspend (NavController) -> Unit = {}
) {
    val navController = rememberNavController()

    DisposableEffect(Unit) {
        ExternalUriHandler.listener = { uri ->
            try {
                navController.navigate(uri)
            } catch (e: Exception) {
                println("Deep link navigation failed: ${e.message}")
            }
        }
        onDispose {
            ExternalUriHandler.listener = null
        }
    }

    NavHost(
        navController = navController,
        startDestination = Screen.Home,
    ) {
        composable<Screen.Home> {
            MainScreen(
                onProjectClick = { projectId ->
                    navController.navigate(Screen.ProjectDetail(projectId))
                }
            )
        }
        composable<Screen.ProjectDetail>(
            deepLinks = listOf(
                navDeepLink<Screen.ProjectDetail>(basePath = "$basePath/project"),
                navDeepLink { uriPattern = "localhost:8080%2F#project%2F{projectId}" },
                navDeepLink { uriPattern = "$basePath%2F#project%2F{projectId}" },
                navDeepLink { uriPattern = "folium://project/{projectId}" },
            )
        ) { backStackEntry ->
            val projectDetail: Screen.ProjectDetail = backStackEntry.toRoute()
            ProjectDetailScreen(
                projectId = projectDetail.projectId,
                onNavigateBack = {
                    navController.navigateUp()
                }
            )
        }
    }
    LaunchedEffect(navController) {
        onNavHostReady(navController)
    }
}
