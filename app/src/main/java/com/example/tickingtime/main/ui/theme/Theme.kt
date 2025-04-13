package com.example.tickingtime.main.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    surface = Black,
    surfaceContainer = Black, //nav , top bar
    onSurfaceVariant = ChineseSilver,
    onSurface = White,
    surfaceContainerHighest = DarkCharcoal, //alarm item
    surfaceContainerHigh = GraniteGray,
    surfaceContainerLow = Gray,
    primary = VeryLightBlue,
    onPrimary = White,
    secondary = SpanishGray,
    onSecondary = White,
    tertiary = PermanentGeraniumLake,
)

private val LightColorScheme = lightColorScheme(
    surface = PhilipineSilver,
    surfaceContainer = PhilipineSilver, //nav , top bar
    onSurfaceVariant = EerieBlack,
    onSurface = Black,
    surfaceContainerHighest = Platinum, //alarm item
    surfaceContainerHigh = DarkCharcoal, //lap and timer presets
    surfaceContainerLow = White,
    primary = VeryLightBlue,
    onPrimary = White,
    secondary = DarkLiver,
    onSecondary = White,
    tertiary = PermanentGeraniumLake
)

@Composable
fun TickingTimeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if(darkTheme){
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}