package software.beta.lumina.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
actual fun LuminaTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable (() -> Unit),
) {
    val context = LocalContext.current

    val colorScheme = when (darkTheme) {
        true -> {
            when (dynamicColor) {
                true -> dynamicDarkColorScheme(context)
                false -> darkScheme
            }
        }

        false -> {
            when (dynamicColor) {
                true -> dynamicLightColorScheme(context)
                false -> lightScheme
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}
