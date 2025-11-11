package com.promni.folium.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.promni.folium.presentation.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun RoleChip(modifier: Modifier = Modifier, role: String) {
    Text(
        modifier = modifier
            .background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 12.dp, vertical = 4.dp),
        text = role,
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.onPrimaryContainer,
    )
}

@Preview
@Composable
fun RoleChipSoftwareDevPreview() {
    ThemedRoleChipPreview(role = "Software Dev", true)
}

@Preview
@Composable
fun RoleChipAndroidDevPreview() {
    ThemedRoleChipPreview(role = "Android Dev", true)
}

@Preview
@Composable
fun RoleChipSoftwareDevPreviewGerman() {
    ThemedRoleChipPreview(role = "Softwareentwickler", false)
}

@Composable
private fun ThemedRoleChipPreview(
    role: String,
    darkTheme: Boolean,
) {
    AppTheme(darkTheme = darkTheme, dynamicColor = false) {
        Surface {
            RoleChip(role = role)
        }
    }
}
