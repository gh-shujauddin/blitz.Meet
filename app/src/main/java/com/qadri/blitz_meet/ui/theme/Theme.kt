package com.qadri.blitz_meet.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

val LightColorScheme = lightColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    primaryContainer = LightGray,
    onPrimaryContainer = DarkBlue,
    secondary = DarkBlue,
    onSecondary = Color.White,
    background = LightGray,
    onBackground = Gray,
    surface = Color.White,
    onSurface = Gray
)

val DarkColorScheme = darkColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    primaryContainer = DarkBlue,
    onPrimaryContainer = LightGray,
    secondary = Gray,
    onSecondary = Color.White,
    background = Gray,
    onBackground = LightGray,
    surface = DarkBlue,
    onSurface = LightGray
)


@Composable
fun BlitzMeetTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}