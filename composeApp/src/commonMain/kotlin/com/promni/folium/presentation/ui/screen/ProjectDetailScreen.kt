package com.promni.folium.presentation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mikepenz.markdown.m3.Markdown
import com.mikepenz.markdown.m3.markdownTypography
import com.mikepenz.markdown.model.rememberMarkdownState
import com.promni.folium.data.ProjectItemData
import com.promni.folium.data.projects
import com.promni.folium.localization.AppStrings
import com.promni.folium.localization.ProvideLanguage
import com.promni.folium.localization.localizedString
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import com.promni.folium.presentation.ui.utils.getContentSidePadding
import com.promni.folium.viewmodel.SettingsViewModel
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProjectDetailScreen(
    projectId: String?,
    onNavigateBack: () -> Unit,
    settingsViewModel: SettingsViewModel = koinViewModel()
) {
    val project = projects.find { it.id == projectId }
    val settings by settingsViewModel.settings.collectAsState()

    ProvideLanguage(settings.language) {
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
            Surface(modifier = Modifier.padding(PaddingValues(top = it.calculateTopPadding(), bottom = 0.dp))) {
                if (project == null) {
                    ProjectNotFound(modifier = Modifier)
                } else {
                    Content(project)
                }
            }
        }
    }
}

@Composable
private fun Content(
    project: ProjectItemData
) {
    val sidePadding = getContentSidePadding()
    val systemBarsPaddings = WindowInsets.systemBars.asPaddingValues()
    val markdownState = rememberMarkdownState(localizedString(project.fullDescription))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = sidePadding)
            .padding(bottom = systemBarsPaddings.calculateBottomPadding() + 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Overview(project)
//        Spacer(modifier = Modifier.height(16.dp))
        Markdown(
            modifier = Modifier.fillMaxSize(),
            markdownState = markdownState,
            typography = markdownTypography(
                h2 = typography.headlineLarge
                    .copy(color = MaterialTheme.colorScheme.primary),
                h3 = typography.headlineMedium
                    .copy(color = MaterialTheme.colorScheme.primary),
                h4 = typography.headlineSmall
                    .copy(color = MaterialTheme.colorScheme.secondary),
            )
        )
    }
}

@Composable
private fun Overview(project: ProjectItemData) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = project.title,
            style = typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = project.shortDescription,
            style = typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = localizedString(project.role),
            style = typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalImageCarousel(project)
    }
}

@Composable
private fun HorizontalImageCarousel(project: ProjectItemData) {
    if (project.images.isNotEmpty()) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(project.images) { image ->
                Image(
                    painter = painterResource(image),
                    contentDescription = null,
                    modifier = Modifier.height(200.dp) 
                )
            }
        }
    }
}

@Composable
private fun ProjectNotFound(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = localizedString(AppStrings.SORRY_PROJECT_NOT_FOUND),
            style = typography.bodyLarge,
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
    ThemedProjectDetailPreview(darkTheme = true, projectId = "mft")

@Composable
@DevicePreviews
private fun ProjectDetailLightPreview() =
    ThemedProjectDetailPreview(darkTheme = false, projectId = "mft")

@Composable
@DevicePreviews
private fun ProjectDetailNotFoundDarkPreview() =
    ThemedProjectDetailPreview(darkTheme = true, projectId = null)

@Composable
@DevicePreviews
private fun ProjectDetailNotFoundLightPreview() =
    ThemedProjectDetailPreview(darkTheme = false, projectId = null)
