package software.beta.lumina

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    LuminaApp(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = false,
    )
}
