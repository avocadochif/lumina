package software.beta.lumina.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
actual fun LuminaTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable (() -> Unit),
) {
    val colorScheme = when (darkTheme) {
        true -> darkScheme
        false -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}
