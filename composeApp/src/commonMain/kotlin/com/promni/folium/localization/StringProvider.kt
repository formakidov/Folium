package com.promni.folium.localization

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.promni.folium.data.model.Language

val LocalLanguage: ProvidableCompositionLocal<Language> = staticCompositionLocalOf { Language.EN }

@Composable
fun ProvideLanguage(language: Language, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalLanguage provides language) {
        content()
    }
}

@Composable
fun localizedString(key: AppStringsId): String {
    val language = LocalLanguage.current
    return strings[language]?.get(key) ?: key
}

private val strings = mapOf(
    Language.EN to enStrings,
    Language.DE to deStrings
)
