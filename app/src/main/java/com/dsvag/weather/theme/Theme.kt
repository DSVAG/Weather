package com.dsvag.weather.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(
    content: @Composable () -> Unit,
) {
    val colorPalette = if (isSystemInDarkTheme()) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colors = colorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}
