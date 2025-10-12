package software.beta.lumina.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import software.beta.lumina.presentation.navigation.args.PlaygroundArgs
import software.beta.lumina.presentation.navigation.args.playgroundArgsNavType
import software.beta.lumina.presentation.screens.gallery.GalleryScreen
import software.beta.lumina.presentation.screens.playground.PlaygroundScreen
import kotlin.reflect.typeOf

@Composable
fun LuminaNavigation(
    modifier: Modifier,
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Gallery,
        modifier = modifier,
        builder = {
            composable<Screens.Gallery> {
                GalleryScreen(
                    modifier = Modifier.fillMaxSize(),
                    navigateToPlayground = { args ->
                        navController.navigate(
                            route = Screens.Playground(
                                args = args,
                            ),
                        )
                    },
                )
            }

            composable<Screens.Playground>(
                typeMap = mapOf(typeOf<PlaygroundArgs>() to playgroundArgsNavType),
            ) {
                PlaygroundScreen(
                    modifier = Modifier.fillMaxSize(),
                )
            }
        },
    )
}
