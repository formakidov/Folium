package com.promni.folium.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.promni.folium.data.model.Language
import com.promni.folium.data.model.UserPreferences
import io.github.xxfast.kstore.KStore
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SettingsViewModel(private val preferencesStorage: KStore<UserPreferences>) : ViewModel() {

    val settings: StateFlow<UserPreferences> = preferencesStorage.updates
        .map { it ?: UserPreferences() }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = UserPreferences()
        )

    fun setLanguage(language: Language) {
        viewModelScope.launch {
            preferencesStorage.update { current ->
                current?.copy(language = language) ?: UserPreferences(language = language)
            }
        }
    }
}
