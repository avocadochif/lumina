package software.beta.lumina.presentation.screens.playground

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.lifecycle.viewmodel.compose.viewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.ui.tooling.preview.PreviewParameter
import software.beta.lumina.core.ui.components.ecosystem.screen.Screen
import software.beta.lumina.core.ui.theme.LuminaTheme
import software.beta.lumina.navigation.args.PlaygroundArgs
import software.beta.lumina.presentation.screens.playground.preview.PlaygroundPreviewProvider
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiState

@Composable
fun PlaygroundScreen(
    modifier: Modifier,
    args: PlaygroundArgs,
) {
    Screen<PlaygroundViewModel, PlaygroundUiState>(
        modifier = modifier,
        viewModel = viewModel { PlaygroundViewModel() },
        onCreate = { viewModel -> viewModel.onCreate(args) },
        content = { viewModel, state ->
            Content(
                modifier = Modifier.fillMaxSize(),
                state = state,
            )
        },
    )
}

@Composable
private fun Content(
    modifier: Modifier,
    state: PlaygroundUiState,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = state.shader,
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
@Preview
private fun ContentPreview(
    @PreviewParameter(PlaygroundPreviewProvider::class) state: PlaygroundUiState,
) {
    LuminaTheme(
        darkTheme = false,
        dynamicColor = false,
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Content(
                modifier = Modifier.fillMaxSize(),
                state = state,
            )
        }
    }
}
