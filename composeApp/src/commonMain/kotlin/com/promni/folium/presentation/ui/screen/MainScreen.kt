package com.promni.folium.presentation.ui.screen

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipAnchorPosition
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider
import androidx.compose.material3.rememberTooltipState
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.promni.folium.data.model.Language
import com.promni.folium.data.projects
import com.promni.folium.localization.AppStrings
import com.promni.folium.localization.ProvideLanguage
import com.promni.folium.localization.localizedString
import com.promni.folium.presentation.ui.components.LanguagePicker
import com.promni.folium.presentation.ui.components.ProjectsCarousel
import com.promni.folium.presentation.ui.utils.getWindowSizeClass
import com.promni.folium.viewmodel.SettingsViewModel
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel
import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.dzwigaj_background
import portare_folium.composeapp.generated.resources.email_to
import portare_folium.composeapp.generated.resources.github_logo
import portare_folium.composeapp.generated.resources.linkedin_logo
import portare_folium.composeapp.generated.resources.photo

@Composable
fun MainScreen(
    onProjectClick: (String) -> Unit,
    settingsViewModel: SettingsViewModel = koinViewModel()
) {
    val settings by settingsViewModel.settings.collectAsState()
    val scrollState = rememberScrollState()
    val systemBarsPaddings = WindowInsets.systemBars.asPaddingValues()
    val sidePadding = getContentSidePadding()

    ProvideLanguage(settings.language) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                Header(
                    modifier = Modifier
                        .fillMaxWidth(),
                    currentLanguage = settings.language,
                    onLanguageChange = settingsViewModel::setLanguage
                )

                Content(
                    modifier = Modifier.padding(
                        top = 48.dp,
                        start = sidePadding,
                        end = sidePadding,
                    ),
                    onProjectClick = onProjectClick
                )

                Footer(
                    modifier = Modifier.padding(
                        top = 32.dp,
                        start = sidePadding,
                        end = sidePadding,
                        bottom = systemBarsPaddings.calculateBottomPadding() + 24.dp
                    )
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun Header(
    modifier: Modifier = Modifier,
    currentLanguage: Language,
    onLanguageChange: (Language) -> Unit
) {
    val statusBarPadding = WindowInsets.systemBars.asPaddingValues().calculateTopPadding()
    val sidePadding = getContentSidePadding()

    Box(modifier = modifier) {

        val backgroundHeight = 192.dp
        BackgroundImage(
            modifier = Modifier
                .height(backgroundHeight)
                .fillMaxWidth()
        )

        Column(modifier = Modifier
            .padding(
                top = statusBarPadding,
                start = sidePadding,
                end = sidePadding,
            )
        ) {

            val halfPhotoHeight = 48.dp

            FlowRow(
                modifier = Modifier
                    .animateContentSize()
                    .padding(top = backgroundHeight - halfPhotoHeight - statusBarPadding),
                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Bottom),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                itemVerticalAlignment = Alignment.Bottom
            ) {
                Photo(modifier = Modifier.size(halfPhotoHeight * 2))

                Subtitle()
            }

            FlowRow(
                modifier = Modifier
                    .animateContentSize()
                    .padding(top = 24.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column {
                    Title()

                    Spacer(modifier = Modifier.height(32.dp))

                    Socials()
                }

                Spacer(modifier = Modifier.width(16.dp))

                Bio(
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .widthIn(min = 384.dp, max = 640.dp)
                )
            }
        }

        LanguagePicker(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 24.dp + statusBarPadding, end = 24.dp),
            languages = Language.entries,
            currentLanguage = currentLanguage,
            onLanguageChange = onLanguageChange
        )
    }
}

@Composable
private fun BackgroundImage(modifier: Modifier = Modifier) {
    Box(modifier, contentAlignment = Alignment.BottomEnd) {
        Image(
            painter = painterResource(Res.drawable.dzwigaj_background),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        BackgroundImageAuthorNote(
            modifier = Modifier
                .padding(end = 4.dp, bottom = 4.dp)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BackgroundImageAuthorNote(modifier: Modifier) {
    val tooltipState = rememberTooltipState(isPersistent = true)
    val scope = rememberCoroutineScope()
    TooltipBox(
        modifier = modifier,
        positionProvider = rememberTooltipPositionProvider(TooltipAnchorPosition.Below),
        tooltip = {
            TooltipContent(text = localizedString(AppStrings.AUTHOR_DZWIGAJ))
        },
        state = tooltipState
    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = {
                        scope.launch {
                            if (tooltipState.isVisible) {
                                tooltipState.dismiss()
                            } else {
                                tooltipState.show()
                            }
                        }
                    }
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Cz. Dzwigaj",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Black,
            )
            Icon(
                modifier = Modifier.padding(start = 4.dp).size(16.dp),
                imageVector = Icons.Outlined.Info,
                contentDescription = null,
                tint = Color.Black
            )
        }
    }
}

@Composable
private fun TooltipContent(modifier: Modifier = Modifier, text: String) {
    Surface(
        modifier = modifier
            .widthIn(max = 512.dp),
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.tertiaryContainer
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            text = text,
            color = MaterialTheme.colorScheme.onTertiaryContainer
        )
    }
}

@Composable
private fun Photo(modifier: Modifier) {
    Image(
        painter = painterResource(Res.drawable.photo),
        contentDescription = localizedString(AppStrings.YAUHENI_FARMAKIDAU),
        modifier = modifier
            .size(128.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.primaryContainer),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun Title(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier
            .animateContentSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(end = 8.dp),
            text = localizedString(AppStrings.HEY_MY_NAME_IS),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            modifier = Modifier
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(8.dp),
            text = localizedString(AppStrings.YAUHENI_FARMAKIDAU),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Subtitle(modifier: Modifier = Modifier) {
    val tooltipState = rememberTooltipState(isPersistent = true)
    val scope = rememberCoroutineScope()
    TooltipBox(
        modifier = modifier,
        positionProvider = rememberTooltipPositionProvider(TooltipAnchorPosition.Below),
        tooltip = {
            TooltipContent(text = localizedString(AppStrings.ETYMOLOGY_TOOLTIP))
        },
        state = tooltipState
    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = {
                        scope.launch {
                            if (tooltipState.isVisible) {
                                tooltipState.dismiss()
                            } else {
                                tooltipState.show()
                            }
                        }
                    }
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = localizedString(AppStrings.PORTARE_FOLIUM),
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.tertiary,
            )
            Icon(
                modifier = Modifier.padding(start = 4.dp),
                imageVector = Icons.Outlined.Info,
                contentDescription = localizedString(AppStrings.ETYMOLOGY),
                tint = MaterialTheme.colorScheme.tertiary
            )
        }
    }
}

@Composable
private fun Bio(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .animateContentSize(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
        shape = RoundedCornerShape(16.dp),
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = localizedString(AppStrings.SHORT_BIO),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    onProjectClick: (String) -> Unit
) {
    Projects(modifier, onProjectClick)
}

@Composable
private fun Projects(
    modifier: Modifier = Modifier,
    onProjectClick: (String) -> Unit
) {
    val valColor = Color(0xFFc47430)
    val myProjectsColor = Color(0xFFb874ad)
    val sortedByDescendingColor = Color(0xFF509be2)
    val projectColor = Color(0xFF76a88c)

    Column(
        modifier = modifier
            .background(
                color = MaterialTheme.colorScheme.surfaceContainer,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(vertical = 16.dp)
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 12.dp),
            text = localizedString(AppStrings.WHAT_IVE_BEEN_BUILDING),
            style = MaterialTheme.typography.titleMedium,
            fontFamily = FontFamily.Monospace,
            color = Color(0xFF808080)
        )

        Text(
            modifier = Modifier.padding(start = 12.dp, end = 4.dp),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSurface,
            fontFamily = FontFamily.Monospace,
            text = buildAnnotatedString {
                append("\n")
                withStyle(style = SpanStyle(color = valColor)) {
                    append("val ")
                }
                withStyle(style = SpanStyle(color = myProjectsColor)) {
                    append("myProjects")
                }
                append(" = listOf<")
                withStyle(style = SpanStyle(color = projectColor)) {
                    append("Project")
                }
                append(">(")
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        ProjectsCarousel(
            items = projects,
            onItemClick = { onProjectClick(it.id) }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            modifier = Modifier
                .padding(start = 12.dp, end = 4.dp),
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSurface,
            fontFamily = FontFamily.Monospace,
            text = buildAnnotatedString {
                append(").")
                withStyle(style = SpanStyle(color = sortedByDescendingColor)) {
                    append("sortedByDescending")
                }
                append(" { it.")
                withStyle(style = SpanStyle(color = myProjectsColor)) {
                    append("lastUsed")
                }
                append(" }")
            }
        )
    }
}


@Composable
private fun Footer(modifier: Modifier = Modifier) {
    Contact(modifier)
}

@Composable
private fun Socials() {
    val uriHandler = LocalUriHandler.current
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        SocialsExtendedButton(
            onClick = { uriHandler.openUri("https://github.com/formakidov") },
            iconRes = Res.drawable.github_logo,
            iconContentDescription = localizedString(AppStrings.GITHUB_LOGO),
            text = localizedString(AppStrings.MY_GITHUB_PROFILE)
        )
        SocialsExtendedButton(
            onClick = { uriHandler.openUri("https://www.linkedin.com/in/yauheni-farmakidau/") },
            iconRes = Res.drawable.linkedin_logo,
            iconContentDescription = localizedString(AppStrings.LINKEDIN_LOGO),
            text = localizedString(AppStrings.MY_LINKEDIN_PROFILE)
        )
        SocialsExtendedButton(
            onClick = { uriHandler.openUri("mailto:yau.farmakidau@gmail.com") },
            iconRes = Res.drawable.email_to,
            iconContentDescription = localizedString(AppStrings.EMAIL_TO),
            text = "yau.farmakidau@gmail.com"
        )
    }
}

@Composable
private fun SocialsExtendedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconRes: DrawableResource,
    iconContentDescription: String? = null,
    text: String
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .selectable(
                selected = false,
                role = Role.Button,
                onClick = onClick
            )
            .padding(vertical = 4.dp, horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier.size(24.dp),
            painter = painterResource(iconRes),
            contentDescription = iconContentDescription,
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            modifier = Modifier.padding(start = 12.dp),
            text = text,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
private fun Contact(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center
    ) {
        SocialIconButton(
            url = "https://github.com/formakidov",
            painter = painterResource(Res.drawable.github_logo),
            contentDescription = localizedString(AppStrings.GITHUB_LOGO)
        )

        Spacer(modifier = Modifier.width(8.dp))

        SocialIconButton(
            url = "https://www.linkedin.com/in/yauheni-farmakidau/",
            painter = painterResource(Res.drawable.linkedin_logo),
            contentDescription = localizedString(AppStrings.LINKEDIN_LOGO)
        )

        Spacer(modifier = Modifier.width(8.dp))

        SocialIconButton(
            url = "mailto:yau.farmakidau@gmail.com",
            painter = painterResource(Res.drawable.email_to),
            contentDescription = localizedString(AppStrings.EMAIL)
        )
    }
}

@Composable
private fun SocialIconButton(
    url: String,
    painter: Painter,
    contentDescription: String
) {
    val uriHandler = LocalUriHandler.current
    Icon(
        modifier = Modifier
            .size(48.dp)
            .clip(RoundedCornerShape(8.dp))
            .selectable(
                selected = false,
                role = Role.Button,
                onClick = { uriHandler.openUri(url) }
            )
            .padding(vertical = 4.dp, horizontal = 8.dp),
        painter = painter,
        contentDescription = contentDescription,
        tint = MaterialTheme.colorScheme.secondary
    )
}

@Composable
private fun getContentSidePadding(): Dp {
    val windowSizeClass = getWindowSizeClass()
    val sidePadding = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> 24.dp
        WindowWidthSizeClass.Medium -> 48.dp
        WindowWidthSizeClass.Expanded -> 96.dp
        else -> 24.dp
    }
    return sidePadding
}
