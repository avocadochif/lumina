package software.beta.lumina.presentation.screens.clickme

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import lumina.composeapp.generated.resources.Res
import lumina.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.ui.tooling.preview.PreviewParameter
import software.beta.lumina.core.ui.components.ecosystem.Screen
import software.beta.lumina.core.ui.theme.LuminaTheme
import software.beta.lumina.core.utils.getPlatform
import software.beta.lumina.presentation.screens.clickme.state.ClickMePreviewProvider
import software.beta.lumina.presentation.screens.clickme.state.ClickMeUiState

@Composable
fun ClickMeScreen(
    modifier: Modifier,
) {
    Screen<ClickMeViewModel, ClickMeUiState>(
        modifier = modifier,
        viewModel = viewModel { ClickMeViewModel() },
        content = { viewModel, state ->
            Content(
                modifier = Modifier.fillMaxSize(),
                state = state,
                onToggleVisibilityClick = viewModel::onToggleVisibilityClick,
            )
        },
    )
}

@Composable
private fun Content(
    modifier: Modifier,
    state: ClickMeUiState,
    onToggleVisibilityClick: () -> Unit,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            Button(
                onClick = onToggleVisibilityClick,
                content = {
                    Text(
                        text = "Click me!",
                    )
                },
            )
            AnimatedVisibility(
                visible = state.isContentVisible,
                content = {
                    val platform = remember { getPlatform() }
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            Image(
                                painter = painterResource(Res.drawable.compose_multiplatform),
                                contentDescription = null,
                            )
                            Text(
                                text = "Compose: ${platform.name}",
                            )
                        },
                    )
                },
            )
        },
    )
}

@Composable
@Preview
private fun ContentPreview(
    @PreviewParameter(ClickMePreviewProvider::class) state: ClickMeUiState,
) {
    LuminaTheme(
        darkTheme = false,
        dynamicColor = false,
        content = {
            Surface(
                modifier = Modifier.fillMaxSize(),
                content = {
                    Content(
                        modifier = Modifier.fillMaxSize(),
                        state = state,
                        onToggleVisibilityClick = {},
                    )
                },
            )
        },
    )
}
