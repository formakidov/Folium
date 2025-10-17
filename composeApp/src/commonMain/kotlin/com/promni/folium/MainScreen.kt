package com.promni.folium

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.promni.folium.data.projects
import com.promni.folium.presentation.ui.components.ProjectsCarousel
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource
import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.github_logo
import portare_folium.composeapp.generated.resources.linkedin_logo


@Composable
fun MainScreen() {
    // todo add language picker
    val scrollState = rememberScrollState()
    val systemBarsPaddings = WindowInsets.systemBars.asPaddingValues()
    val safePaddings = WindowInsets.safeDrawing.asPaddingValues()
    val layoutDirection = LocalLayoutDirection.current

    val startPadding = max(safePaddings.calculateStartPadding(layoutDirection), 24.dp)
    val endPadding = max(safePaddings.calculateEndPadding(layoutDirection), 24.dp)

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            Header(modifier = Modifier.padding(
                top = systemBarsPaddings.calculateTopPadding(),
                start = startPadding,
                end = endPadding,
            ))

            Content(modifier = Modifier.padding(
                top = 48.dp,
                start = startPadding,
                end = endPadding,
            ))

            Footer(modifier = Modifier.padding(
                top = 32.dp,
                start = startPadding,
                end = endPadding,
                bottom = systemBarsPaddings.calculateBottomPadding() + 24.dp
            ))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
private fun Header(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Title(modifier = Modifier.padding(top = 24.dp))

        Spacer(modifier = Modifier.height(8.dp))

        Subtitle()

        Spacer(modifier = Modifier.height(16.dp))

        ShortBio()

        Spacer(modifier = Modifier.height(8.dp))

        Socials()
    }
}

@Composable
private fun Title(modifier: Modifier = Modifier) {
    FlowRow(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(end = 8.dp),
            text = "Hey, my name is",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(
            modifier = Modifier
                .padding(vertical = 4.dp)
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(8.dp),
            text = "Yauheni Farmakidau",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Subtitle() {
    FlowRow(verticalArrangement = Arrangement.Center) {
        Text(
            text = "...and this is my ",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.onSurface
        )
        val tooltipState = rememberTooltipState(isPersistent = true)
        val scope = rememberCoroutineScope()
        TooltipBox(
            positionProvider = rememberTooltipPositionProvider(TooltipAnchorPosition.Below),
            tooltip = {
                Surface(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .widthIn(max = 512.dp),
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.tertiaryContainer
                ) {
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = "From Latin 'portare' (to carry) and 'folium' (leaf/sheet), evolving to mean 'a collection of work'.",
                        color = MaterialTheme.colorScheme.onTertiaryContainer
                    )
                }
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
                    text = "Portare Folium",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.tertiary,
                )
                Icon(
                    modifier = Modifier.padding(start = 4.dp),
                    imageVector = Icons.Outlined.Info,
                    contentDescription = "Etymology",
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }
        }
    }
}

@Composable
private fun ShortBio() {
    Card(
        modifier = Modifier,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "I'm a Software Engineer who loves a good game of squash or table tennis, building useful (and colorful) mobile apps, and geeking out over HoMM3!",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
private fun Content(modifier: Modifier = Modifier) {
    Column(modifier) {
        Projects()
        AboutMe()
    }
}

@Composable
private fun Projects() {
    val valColor = Color(0xFFc47430)
    val myProjectsColor = Color(0xFFb874ad)
    val sortedByDescendingColor = Color(0xFF509be2)
    val projectColor = Color(0xFF76a88c)

    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.surfaceContainer,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(vertical = 16.dp)
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 12.dp),
            text = "// What I've been building",
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

        ProjectsCarousel(items = projects)

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
private fun AboutMe() {
//    TODO("Not yet implemented") A short, friendly expansion of your bio
}

@Composable
private fun Socials() {
    val uriHandler = LocalUriHandler.current
    FlowRow(verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = { uriHandler.openUri("https://github.com/formakidov") }
                )
                .padding(vertical = 4.dp, horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(Res.drawable.github_logo),
                contentDescription = "GitHub logo",
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                modifier = Modifier.padding(start = 12.dp),
                text = "My GitHub Profile",
                color = MaterialTheme.colorScheme.primary
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = { uriHandler.openUri("https://www.linkedin.com/in/yauheni-farmakidau/") }
                )
                .padding(vertical = 4.dp, horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(Res.drawable.linkedin_logo),
                contentDescription = "LinkedIn logo",
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                modifier = Modifier.padding(start = 12.dp),
                text = "My LinkedIn Profile",
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Composable
private fun Contact(modifier: Modifier = Modifier) {
    val uriHandler = LocalUriHandler.current
    FlowRow(
        modifier = modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = { uriHandler.openUri("https://github.com/formakidov") }
                )
                .padding(vertical = 4.dp, horizontal = 8.dp),
            painter = painterResource(Res.drawable.github_logo),
            contentDescription = "GitHub logo",
            tint = MaterialTheme.colorScheme.secondary
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = { uriHandler.openUri("https://www.linkedin.com/in/yauheni-farmakidau/") }
                )
                .padding(vertical = 4.dp, horizontal = 8.dp),
            painter = painterResource(Res.drawable.linkedin_logo),
            contentDescription = "LinkedIn logo",
            tint = MaterialTheme.colorScheme.secondary
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .selectable(
                    selected = false,
                    role = Role.Button,
                    onClick = { uriHandler.openUri("mailto:yau.farmakidau@gmail.com") }
                )
                .padding(vertical = 4.dp, horizontal = 8.dp),
            imageVector = Icons.Outlined.Email,
            contentDescription = "Email",
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}
