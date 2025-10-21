package software.beta.lumina.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import software.beta.lumina.navigation.args.PlaygroundArgs
import software.beta.lumina.navigation.args.playgroundArgsNavType
import software.beta.lumina.navigation.screens.Screens
import software.beta.lumina.presentation.screens.gallery.GalleryScreen
import software.beta.lumina.presentation.screens.playground.PlaygroundScreen
import kotlin.reflect.typeOf

@Composable
fun LuminaNavigation(
    modifier: Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Gallery,
        modifier = modifier,
    ) {
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
        ) { navBackStackEntry ->
            val route = navBackStackEntry.toRoute<Screens.Playground>()
            PlaygroundScreen(
                modifier = Modifier.fillMaxSize(),
                args = route.args,
            )
        }
    }
}
