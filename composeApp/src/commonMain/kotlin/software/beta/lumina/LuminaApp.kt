package software.beta.lumina

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import software.beta.lumina.core.ui.theme.LuminaTheme
import software.beta.lumina.navigation.LuminaNavigation

@Composable
@Preview
fun LuminaApp(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    LuminaTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor,
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            val navController = rememberNavController()

            LuminaNavigation(
                modifier = Modifier.fillMaxSize(),
                navController = navController,
            )
        }
    }

}
