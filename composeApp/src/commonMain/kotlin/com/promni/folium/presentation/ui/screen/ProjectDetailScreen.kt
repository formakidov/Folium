package com.promni.folium.presentation.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.promni.folium.data.ProjectItemData
import com.promni.folium.data.projects
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import org.jetbrains.compose.resources.stringResource
import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.back
import portare_folium.composeapp.generated.resources.project_not_found
import portare_folium.composeapp.generated.resources.sorry_we_couldnt_find_that_project

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProjectDetailScreen(
    projectId: String?,
    onNavigateBack: () -> Unit
) {
    val project = projects.find { it.id == projectId }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(project?.title ?: stringResource( Res.string.project_not_found)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource( Res.string.back)
                        )
                    }
                }
            )
        }
    ) {
        Surface {
            if (project == null) {
                ProjectNotFound(modifier = Modifier)
            } else {
                Content(project)
            }
        }
    }
}

@Composable
private fun Content(
    project: ProjectItemData
) {
    // todo add content
}

@Composable
private fun ProjectNotFound(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = stringResource( Res.string.sorry_we_couldnt_find_that_project),
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}


@Composable
private fun ThemedProjectDetailPreview(
    darkTheme: Boolean,
    projectId: String?,
) {
    AppTheme(darkTheme = darkTheme, dynamicColor = false) {
        Surface {
            ProjectDetailScreen(projectId, onNavigateBack = {})
        }
    }
}

@Composable
@DevicePreviews
private fun ProjectDetailDarkPreview() =
    ThemedProjectDetailPreview(darkTheme = true, projectId = "1")

@Composable
@DevicePreviews
private fun ProjectDetailLightPreview() =
    ThemedProjectDetailPreview(darkTheme = false, projectId = "1")

@Composable
@DevicePreviews
private fun ProjectDetailNotFoundDarkPreview() =
    ThemedProjectDetailPreview(darkTheme = true, projectId = null)

@Composable
@DevicePreviews
private fun ProjectDetailNotFoundLightPreview() =
    ThemedProjectDetailPreview(darkTheme = false, projectId = null)
