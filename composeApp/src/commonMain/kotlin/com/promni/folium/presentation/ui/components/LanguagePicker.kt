package com.promni.folium.presentation.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.promni.folium.data.model.Language
import com.promni.folium.presentation.ui.theme.AppTheme
import com.promni.folium.presentation.ui.utils.DevicePreviews
import org.jetbrains.compose.resources.painterResource

@Composable
fun LanguagePicker(
    modifier: Modifier = Modifier,
    languages: List<Language>,
    currentLanguage: Language,
    onLanguageChange: (Language) -> Unit,
) {
    var expanded by remember { mutableStateOf(false) }

    Column(modifier = modifier
        .clip(RoundedCornerShape(12.dp))
        .background(color = MaterialTheme.colorScheme.surface)
        .border(
            width = 2.dp,
            color = MaterialTheme.colorScheme.secondaryFixedDim,
            shape = RoundedCornerShape(12.dp)
        ),
    ) {
        LanguageItem(
            language = currentLanguage,
            tint = MaterialTheme.colorScheme.onSurface,
            onClick = { expanded = !expanded }
        )
        AnimatedVisibility(
            visible = expanded,
            enter = expandVertically() + fadeIn(),
            exit = shrinkVertically() + fadeOut()
        ) {
            Surface(
                color = MaterialTheme.colorScheme.surfaceVariant,
            ) {
                Column {
                    languages.filter { it != currentLanguage }.forEach { language ->
                        LanguageItem(
                            language = language,
                            tint = MaterialTheme.colorScheme.onSurface,
                            onClick = {
                                onLanguageChange(language)
                                expanded = false
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun LanguageItem(
    modifier: Modifier = Modifier,
    language: Language,
    tint: Color,
    onClick: (() -> Unit)? = null
) {
    Row(
        modifier = modifier
            .then(if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .size(24.dp),
            painter = painterResource(language.icon),
            contentDescription = language.displayName,
            tint = Color.Unspecified
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = language.code.uppercase(),
            color = tint,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Composable
private fun ThemedLanguagePickerPreview(
    darkTheme: Boolean,
) {
    AppTheme(darkTheme = darkTheme, dynamicColor = false) {
        Surface {
            LanguagePicker(
                currentLanguage = Language.EN,
                languages = Language.entries,
                onLanguageChange = {}
            )
        }
    }
}

@Composable
@DevicePreviews
private fun LanguagePickerDarkPreview() =
    ThemedLanguagePickerPreview(darkTheme = true)

@Composable
@DevicePreviews
private fun LanguagePickerLightPreview() =
    ThemedLanguagePickerPreview(darkTheme = false)
