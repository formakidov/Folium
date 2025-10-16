package com.promni.folium.presentation.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.promni.folium.presentation.ui.theme.backgroundDark
import com.promni.folium.presentation.ui.theme.backgroundDarkHighContrast
import com.promni.folium.presentation.ui.theme.backgroundDarkMediumContrast
import com.promni.folium.presentation.ui.theme.backgroundLight
import com.promni.folium.presentation.ui.theme.backgroundLightHighContrast
import com.promni.folium.presentation.ui.theme.backgroundLightMediumContrast
import com.promni.folium.presentation.ui.theme.errorContainerDark
import com.promni.folium.presentation.ui.theme.errorContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.errorContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.errorContainerLight
import com.promni.folium.presentation.ui.theme.errorContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.errorContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.errorDark
import com.promni.folium.presentation.ui.theme.errorDarkHighContrast
import com.promni.folium.presentation.ui.theme.errorDarkMediumContrast
import com.promni.folium.presentation.ui.theme.errorLight
import com.promni.folium.presentation.ui.theme.errorLightHighContrast
import com.promni.folium.presentation.ui.theme.errorLightMediumContrast
import com.promni.folium.presentation.ui.theme.inverseOnSurfaceDark
import com.promni.folium.presentation.ui.theme.inverseOnSurfaceDarkHighContrast
import com.promni.folium.presentation.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.promni.folium.presentation.ui.theme.inverseOnSurfaceLight
import com.promni.folium.presentation.ui.theme.inverseOnSurfaceLightHighContrast
import com.promni.folium.presentation.ui.theme.inverseOnSurfaceLightMediumContrast
import com.promni.folium.presentation.ui.theme.inversePrimaryDark
import com.promni.folium.presentation.ui.theme.inversePrimaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.inversePrimaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.inversePrimaryLight
import com.promni.folium.presentation.ui.theme.inversePrimaryLightHighContrast
import com.promni.folium.presentation.ui.theme.inversePrimaryLightMediumContrast
import com.promni.folium.presentation.ui.theme.inverseSurfaceDark
import com.promni.folium.presentation.ui.theme.inverseSurfaceDarkHighContrast
import com.promni.folium.presentation.ui.theme.inverseSurfaceDarkMediumContrast
import com.promni.folium.presentation.ui.theme.inverseSurfaceLight
import com.promni.folium.presentation.ui.theme.inverseSurfaceLightHighContrast
import com.promni.folium.presentation.ui.theme.inverseSurfaceLightMediumContrast
import com.promni.folium.presentation.ui.theme.onBackgroundDark
import com.promni.folium.presentation.ui.theme.onBackgroundDarkHighContrast
import com.promni.folium.presentation.ui.theme.onBackgroundDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onBackgroundLight
import com.promni.folium.presentation.ui.theme.onBackgroundLightHighContrast
import com.promni.folium.presentation.ui.theme.onBackgroundLightMediumContrast
import com.promni.folium.presentation.ui.theme.onErrorContainerDark
import com.promni.folium.presentation.ui.theme.onErrorContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.onErrorContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onErrorContainerLight
import com.promni.folium.presentation.ui.theme.onErrorContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.onErrorContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.onErrorDark
import com.promni.folium.presentation.ui.theme.onErrorDarkHighContrast
import com.promni.folium.presentation.ui.theme.onErrorDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onErrorLight
import com.promni.folium.presentation.ui.theme.onErrorLightHighContrast
import com.promni.folium.presentation.ui.theme.onErrorLightMediumContrast
import com.promni.folium.presentation.ui.theme.onPrimaryContainerDark
import com.promni.folium.presentation.ui.theme.onPrimaryContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.onPrimaryContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onPrimaryContainerLight
import com.promni.folium.presentation.ui.theme.onPrimaryContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.onPrimaryContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.onPrimaryDark
import com.promni.folium.presentation.ui.theme.onPrimaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.onPrimaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onPrimaryLight
import com.promni.folium.presentation.ui.theme.onPrimaryLightHighContrast
import com.promni.folium.presentation.ui.theme.onPrimaryLightMediumContrast
import com.promni.folium.presentation.ui.theme.onSecondaryContainerDark
import com.promni.folium.presentation.ui.theme.onSecondaryContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.onSecondaryContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onSecondaryContainerLight
import com.promni.folium.presentation.ui.theme.onSecondaryContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.onSecondaryContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.onSecondaryDark
import com.promni.folium.presentation.ui.theme.onSecondaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.onSecondaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onSecondaryLight
import com.promni.folium.presentation.ui.theme.onSecondaryLightHighContrast
import com.promni.folium.presentation.ui.theme.onSecondaryLightMediumContrast
import com.promni.folium.presentation.ui.theme.onSurfaceDark
import com.promni.folium.presentation.ui.theme.onSurfaceDarkHighContrast
import com.promni.folium.presentation.ui.theme.onSurfaceDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onSurfaceLight
import com.promni.folium.presentation.ui.theme.onSurfaceLightHighContrast
import com.promni.folium.presentation.ui.theme.onSurfaceLightMediumContrast
import com.promni.folium.presentation.ui.theme.onSurfaceVariantDark
import com.promni.folium.presentation.ui.theme.onSurfaceVariantDarkHighContrast
import com.promni.folium.presentation.ui.theme.onSurfaceVariantDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onSurfaceVariantLight
import com.promni.folium.presentation.ui.theme.onSurfaceVariantLightHighContrast
import com.promni.folium.presentation.ui.theme.onSurfaceVariantLightMediumContrast
import com.promni.folium.presentation.ui.theme.onTertiaryContainerDark
import com.promni.folium.presentation.ui.theme.onTertiaryContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.onTertiaryContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onTertiaryContainerLight
import com.promni.folium.presentation.ui.theme.onTertiaryContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.onTertiaryContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.onTertiaryDark
import com.promni.folium.presentation.ui.theme.onTertiaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.onTertiaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.onTertiaryLight
import com.promni.folium.presentation.ui.theme.onTertiaryLightHighContrast
import com.promni.folium.presentation.ui.theme.onTertiaryLightMediumContrast
import com.promni.folium.presentation.ui.theme.outlineDark
import com.promni.folium.presentation.ui.theme.outlineDarkHighContrast
import com.promni.folium.presentation.ui.theme.outlineDarkMediumContrast
import com.promni.folium.presentation.ui.theme.outlineLight
import com.promni.folium.presentation.ui.theme.outlineLightHighContrast
import com.promni.folium.presentation.ui.theme.outlineLightMediumContrast
import com.promni.folium.presentation.ui.theme.outlineVariantDark
import com.promni.folium.presentation.ui.theme.outlineVariantDarkHighContrast
import com.promni.folium.presentation.ui.theme.outlineVariantDarkMediumContrast
import com.promni.folium.presentation.ui.theme.outlineVariantLight
import com.promni.folium.presentation.ui.theme.outlineVariantLightHighContrast
import com.promni.folium.presentation.ui.theme.outlineVariantLightMediumContrast
import com.promni.folium.presentation.ui.theme.primaryContainerDark
import com.promni.folium.presentation.ui.theme.primaryContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.primaryContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.primaryContainerLight
import com.promni.folium.presentation.ui.theme.primaryContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.primaryContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.primaryDark
import com.promni.folium.presentation.ui.theme.primaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.primaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.primaryLight
import com.promni.folium.presentation.ui.theme.primaryLightHighContrast
import com.promni.folium.presentation.ui.theme.primaryLightMediumContrast
import com.promni.folium.presentation.ui.theme.scrimDark
import com.promni.folium.presentation.ui.theme.scrimDarkHighContrast
import com.promni.folium.presentation.ui.theme.scrimDarkMediumContrast
import com.promni.folium.presentation.ui.theme.scrimLight
import com.promni.folium.presentation.ui.theme.scrimLightHighContrast
import com.promni.folium.presentation.ui.theme.scrimLightMediumContrast
import com.promni.folium.presentation.ui.theme.secondaryContainerDark
import com.promni.folium.presentation.ui.theme.secondaryContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.secondaryContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.secondaryContainerLight
import com.promni.folium.presentation.ui.theme.secondaryContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.secondaryContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.secondaryDark
import com.promni.folium.presentation.ui.theme.secondaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.secondaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.secondaryLight
import com.promni.folium.presentation.ui.theme.secondaryLightHighContrast
import com.promni.folium.presentation.ui.theme.secondaryLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceBrightDark
import com.promni.folium.presentation.ui.theme.surfaceBrightDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceBrightDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceBrightLight
import com.promni.folium.presentation.ui.theme.surfaceBrightLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceBrightLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerDark
import com.promni.folium.presentation.ui.theme.surfaceContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighDark
import com.promni.folium.presentation.ui.theme.surfaceContainerHighDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighLight
import com.promni.folium.presentation.ui.theme.surfaceContainerHighLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighestDark
import com.promni.folium.presentation.ui.theme.surfaceContainerHighestDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighestLight
import com.promni.folium.presentation.ui.theme.surfaceContainerHighestLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerHighestLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLight
import com.promni.folium.presentation.ui.theme.surfaceContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowDark
import com.promni.folium.presentation.ui.theme.surfaceContainerLowDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowLight
import com.promni.folium.presentation.ui.theme.surfaceContainerLowLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowestDark
import com.promni.folium.presentation.ui.theme.surfaceContainerLowestDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowestLight
import com.promni.folium.presentation.ui.theme.surfaceContainerLowestLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceContainerLowestLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceDark
import com.promni.folium.presentation.ui.theme.surfaceDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceDimDark
import com.promni.folium.presentation.ui.theme.surfaceDimDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceDimDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceDimLight
import com.promni.folium.presentation.ui.theme.surfaceDimLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceDimLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceLight
import com.promni.folium.presentation.ui.theme.surfaceLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceLightMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceVariantDark
import com.promni.folium.presentation.ui.theme.surfaceVariantDarkHighContrast
import com.promni.folium.presentation.ui.theme.surfaceVariantDarkMediumContrast
import com.promni.folium.presentation.ui.theme.surfaceVariantLight
import com.promni.folium.presentation.ui.theme.surfaceVariantLightHighContrast
import com.promni.folium.presentation.ui.theme.surfaceVariantLightMediumContrast
import com.promni.folium.presentation.ui.theme.tertiaryContainerDark
import com.promni.folium.presentation.ui.theme.tertiaryContainerDarkHighContrast
import com.promni.folium.presentation.ui.theme.tertiaryContainerDarkMediumContrast
import com.promni.folium.presentation.ui.theme.tertiaryContainerLight
import com.promni.folium.presentation.ui.theme.tertiaryContainerLightHighContrast
import com.promni.folium.presentation.ui.theme.tertiaryContainerLightMediumContrast
import com.promni.folium.presentation.ui.theme.tertiaryDark
import com.promni.folium.presentation.ui.theme.tertiaryDarkHighContrast
import com.promni.folium.presentation.ui.theme.tertiaryDarkMediumContrast
import com.promni.folium.presentation.ui.theme.tertiaryLight
import com.promni.folium.presentation.ui.theme.tertiaryLightHighContrast
import com.promni.folium.presentation.ui.theme.tertiaryLightMediumContrast

@Composable
expect fun AppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)

val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)
