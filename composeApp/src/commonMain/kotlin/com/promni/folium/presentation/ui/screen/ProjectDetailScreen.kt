package com.promni.folium.presentation.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.mikepenz.markdown.m3.Markdown
import com.mikepenz.markdown.m3.markdownTypography
import com.mikepenz.markdown.model.rememberMarkdownState
import com.promni.folium.data.ProjectItemData
import com.promni.folium.data.projects
import com.promni.folium.localization.AppStrings
import com.promni.folium.localization.ProvideLanguage
import com.promni.folium.localization.localizedString
import com.promni.folium.presentation.ui.components.RoleChip
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import com.promni.folium.presentation.ui.utils.getContentSidePadding
import com.promni.folium.viewmodel.SettingsViewModel
import org.koin.compose.viewmodel.koinViewModel
import portare_folium.composeapp.generated.resources.Res

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
        Overview(project)
        Spacer(modifier = Modifier.height(16.dp))
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
        ProjectDetailsTable(project)
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalImageCarousel(project)
    }
}

@Composable
private fun ProjectDetailsTable(project: ProjectItemData) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        ProjectDetailRow(label = localizedString(AppStrings.MY_ROLE)) {
            RoleChip(role = localizedString(project.role))
        }
        if (project.company != null) {
            ProjectDetailRow(label = localizedString(AppStrings.COMPANY)) {
                DefaultDetailText(text = localizedString(project.company))
            }
        }
        if (project.appLink != null) {
            ProjectDetailRow(label = localizedString(AppStrings.APP_LINK)) {
                LinkText(url = project.appLink)
            }
        }
        if (project.projectLink != null) {
            ProjectDetailRow(label = localizedString(AppStrings.PROJECT_LINK)) {
                LinkText(url = project.projectLink)
            }
        }
        ProjectDetailRow(label = localizedString(AppStrings.SOURCE_CODE)) {
            if (project.sourceCodeLink != null) {
                LinkText(url = project.sourceCodeLink)
            } else {
                Text(text = localizedString(AppStrings.NDA), style = typography.bodyMedium)
            }
        }
        if (project.devPeriod != null) {
            ProjectDetailRow(label = localizedString(AppStrings.DEV_PERIOD)) {
                DefaultDetailText(text = project.devPeriod)
            }
        }
    }
}

@Composable
private fun DefaultDetailText(text: String) {
    Text(
        text = text,
        style = typography.bodyMedium,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
private fun LinkText(url: String) {
    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.primary)) {
            pushLink(LinkAnnotation.Url(url))
            append(url)
            pop()
        }
    }
    Text(
        text = annotatedString,
        style = typography.bodyMedium,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
private fun ProjectDetailRow(
    label: String,
    content: @Composable () -> Unit
) {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = label,
            style = typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.width(176.dp)
        )
        content()
    }
}

@Composable
private fun HorizontalImageCarousel(project: ProjectItemData) {
    if (project.images.isNotEmpty()) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(project.images) { image ->
                AsyncImage(
                    model = Res.getUri(image),
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
