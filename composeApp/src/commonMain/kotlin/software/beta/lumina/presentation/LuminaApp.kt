package software.beta.lumina.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import software.beta.lumina.core.ui.theme.LuminaTheme
import software.beta.lumina.presentation.navigation.LuminaNavigation

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
                    val navController = rememberNavController()

                    LuminaNavigation(
                        modifier = Modifier.fillMaxSize(),
                        navController = navController,
                    )
                },
            )
        },
    )

}
