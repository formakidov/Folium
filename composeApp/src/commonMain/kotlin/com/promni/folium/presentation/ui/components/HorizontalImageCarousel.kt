package com.promni.folium.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.promni.folium.data.ProjectItemData
import com.promni.folium.localization.AppStrings
import com.promni.folium.localization.localizedString
import portare_folium.composeapp.generated.resources.Res

@Composable
private fun HorizontalImageCarousel(
    project: ProjectItemData,
    onImageClick: (String) -> Unit
) {
    if (project.images.isNotEmpty()) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            items(project.images) { image ->
                AsyncImage(
                    model = Res.getUri(image),
                    contentDescription = localizedString(AppStrings.SCREENSHOT_DESCRIPTION),
                    contentScale = ContentScale.FillWidth,
                    alignment = Alignment.TopCenter,
                    modifier = Modifier
                        .width(160.dp)
                        .height(320.dp)
                        .clip(MaterialTheme.shapes.medium)
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .clickable { onImageClick(image) }
                )
            }
        }
    }
}
