@file:OptIn(ExperimentalMaterial3Api::class)

package com.promni.folium.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.promni.folium.data.ProjectItemData
import com.promni.folium.data.projects
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import com.promni.folium.presentation.ui.utils.getWindowSizeClass
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProjectsCarousel(
    modifier: Modifier = Modifier,
    items: List<ProjectItemData>
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
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselItem(
    item: ProjectItemData,
    modifier: Modifier = Modifier
) {
    val textColor = item.titleTextColor ?: MaterialTheme.colorScheme.onPrimaryContainer
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = item.containerColor ?: MaterialTheme.colorScheme.primaryContainer),
    ) {
        Column {
            Image(
                painter = painterResource(item.backgroundImage),
                contentDescription = item.title,
                modifier = Modifier.weight(1f).fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(start = 24.dp, end = 8.dp, bottom = 16.dp, top = 16.dp)) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.titleLarge,
                    color = textColor,
                )
                Text(
                    text = item.shortDescription,
                    style = MaterialTheme.typography.titleMedium,
                    color = textColor.copy(alpha = 0.8f),
                )
                FlowRow(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalArrangement = Arrangement.spacedBy((-10).dp)
                ) {
                    item.platforms.forEach { platform ->
                        AssistChip(
                            onClick = { },
                            label = { Text(platform.displayName) },
                            leadingIcon = {
                                Icon(
                                    painter = painterResource(platform.icon),
                                    contentDescription = "${platform.displayName} icon",
                                    Modifier.size(AssistChipDefaults.IconSize)
                                )
                            },
                            colors = AssistChipDefaults.assistChipColors(
                                containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                                labelColor = MaterialTheme.colorScheme.onTertiaryContainer,
                                leadingIconContentColor = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        )
                    }
                }
            }
        }
    }
}

@DevicePreviews
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
private fun CarouselDarkPreview() =
    ThemedCarouselPreview(darkTheme = true)

@Composable
private fun CarouselLightPreview() =
    ThemedCarouselPreview(darkTheme = false)
