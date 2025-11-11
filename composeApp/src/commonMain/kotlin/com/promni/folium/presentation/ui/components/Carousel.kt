@file:OptIn(ExperimentalMaterial3Api::class)

package com.promni.folium.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.promni.folium.data.Platform
import com.promni.folium.data.ProjectItemData
import com.promni.folium.data.projects
import com.promni.folium.localization.localizedString
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import com.promni.folium.presentation.ui.utils.getWindowSizeClass
import org.jetbrains.compose.resources.painterResource
import portare_folium.composeapp.generated.resources.Res
import portare_folium.composeapp.generated.resources.wip

@Composable
fun ProjectsCarousel(
    modifier: Modifier = Modifier,
    items: List<ProjectItemData>,
    onItemClick: (ProjectItemData) -> Unit = {}
) {
    val state = rememberCarouselState { items.count() }
    val windowSizeClass = getWindowSizeClass()
    val preferredItemWidth = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> 320.dp
        WindowWidthSizeClass.Medium -> 384.dp
        WindowWidthSizeClass.Expanded -> 512.dp
        else -> 320.dp
    }
    val preferredItemHeight = when (windowSizeClass.heightSizeClass) {
        WindowHeightSizeClass.Compact -> 240.dp
        WindowHeightSizeClass.Medium -> 288.dp
        WindowHeightSizeClass.Expanded -> 384.dp
        else -> 240.dp
    }

    HorizontalMultiBrowseCarousel(
        state = state,
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 24.dp),
        itemSpacing = 16.dp,
        preferredItemWidth = preferredItemWidth,
    ) { i ->
        CarouselItem(
            item = items[i],
            modifier = Modifier
                .height(preferredItemHeight)
                .maskClip(MaterialTheme.shapes.large)
                .clickable { onItemClick(items[i]) }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselItem(
    item: ProjectItemData,
    modifier: Modifier = Modifier
) {
    val textColor = item.titleTextColor ?: MaterialTheme.colorScheme.onSurface
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainerHighest),
    ) {
        Column {
            Image(
                painter = painterResource(item.imageRes ?: Res.drawable.wip),
                contentDescription = item.title,
                modifier = Modifier.weight(1f).fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(top = 12.dp, end = 8.dp, bottom = 0.dp)) {
                Text(
                    modifier = Modifier
                        .padding(start = 24.dp),
                    text = item.title,
                    style = MaterialTheme.typography.titleLarge,
                    color = textColor,
                )

                Spacer(modifier = Modifier.height(12.dp))

                RoleChip(
                    modifier = Modifier.padding(start = 24.dp),
                    role = localizedString(item.role)
                )

                Platforms(item.platforms)
            }
        }
    }
}

@Composable
private fun Platforms(platforms: List<Platform>) {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 24.dp, end = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        platforms.forEach { platform ->
            AssistChip(
                onClick = { },
                label = { Text(platform.displayName) },
                leadingIcon = {
                    Icon(
                        painter = painterResource(platform.icon),
                        contentDescription = "${platform.displayName} icon",
                        modifier = Modifier.size(AssistChipDefaults.IconSize)
                    )
                },
                colors = AssistChipDefaults.assistChipColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                    labelColor = MaterialTheme.colorScheme.onTertiaryContainer,
                    leadingIconContentColor = MaterialTheme.colorScheme.onTertiaryContainer
                ),
            )
        }
    }
}


@Composable
private fun ThemedCarouselPreview(
    darkTheme: Boolean,
) {
    AppTheme(darkTheme = darkTheme, dynamicColor = false) {
        Surface {
            ProjectsCarousel(items = projects)
        }
    }
}

@Composable
@DevicePreviews
private fun CarouselDarkPreview() =
    ThemedCarouselPreview(darkTheme = true)

@Composable
@DevicePreviews
private fun CarouselLightPreview() =
    ThemedCarouselPreview(darkTheme = false)
