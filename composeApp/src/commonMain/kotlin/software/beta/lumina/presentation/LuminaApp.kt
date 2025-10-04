package software.beta.lumina.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import software.beta.lumina.core.ui.theme.LuminaTheme
import software.beta.lumina.presentation.screens.clickme.ClickMeScreen

@Composable
@Preview
fun LuminaApp(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    LuminaTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor,
        content = {
            Surface(
                modifier = Modifier.fillMaxSize(),
                content = {
                    ClickMeScreen(
                        modifier = Modifier
                            .fillMaxSize()
                            .safeContentPadding(),
                    )
                },
            )
        },
    )

}
