package com.promni.folium.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.promni.folium.presentation.ui.screen.MainScreen
import com.promni.folium.presentation.ui.screen.ProjectDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

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
        composable<Screen.ProjectDetail> { backStackEntry ->
            val projectDetail: Screen.ProjectDetail = backStackEntry.toRoute()
            ProjectDetailScreen(
                projectId = projectDetail.projectId,
                onNavigateBack = {
                    navController.navigateUp()
                }
            )
        }
    }
}
