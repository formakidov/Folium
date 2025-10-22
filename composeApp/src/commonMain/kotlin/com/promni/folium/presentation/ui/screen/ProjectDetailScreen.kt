package com.promni.folium.presentation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.unit.dp
import com.promni.folium.data.ProjectItemData
import com.promni.folium.data.projects
import com.promni.folium.localization.AppStrings
import com.promni.folium.localization.localizedString
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import org.jetbrains.compose.resources.painterResource
import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.wip

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
                title = { Text(project?.title ?: localizedString(AppStrings.PROJECT_NOT_FOUND)) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = localizedString(AppStrings.BACK)
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
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .size(width = 600.dp, height = 400.dp),
            painter = painterResource(Res.drawable.wip),
            contentDescription = null
        )
    }

    // todo add content
}

@Composable
private fun ProjectNotFound(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = localizedString(AppStrings.SORRY_PROJECT_NOT_FOUND),
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
