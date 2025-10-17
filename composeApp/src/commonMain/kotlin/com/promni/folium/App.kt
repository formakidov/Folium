package com.promni.folium

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.promni.folium.data.projects
import com.promni.folium.presentation.ui.components.ProjectsCarousel
import com.promni.folium.presentation.ui.theme.AppTheme
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    val scrollState = rememberScrollState()

    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.safeDrawingPadding().verticalScroll(scrollState)) {
                AboutMe()

                Spacer(modifier = Modifier.height(32.dp))

                Projects()

                Spacer(modifier = Modifier.height(32.dp))

                Skills()

                Spacer(modifier = Modifier.height(32.dp))

                Contact()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun AboutMe() {
    Column(modifier = Modifier.padding(horizontal = 24.dp)) {
        FlowRow(verticalArrangement = Arrangement.Center) {
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

        Spacer(modifier = Modifier.height(8.dp))

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

        Spacer(modifier = Modifier.height(32.dp))

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
    Column {
        Text(
            modifier = Modifier.padding(horizontal = 24.dp),
            text = "Projects",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.height(8.dp))
        ProjectsCarousel(items = projects)
    }
}


@Preview
@Composable
fun AppAndroidPreview() {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    )
}
