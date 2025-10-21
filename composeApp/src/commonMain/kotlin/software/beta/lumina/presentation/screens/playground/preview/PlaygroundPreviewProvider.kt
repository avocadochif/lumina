package software.beta.lumina.presentation.screens.playground.preview

import org.jetbrains.compose.ui.tooling.preview.PreviewParameterProvider
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiState
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiStateFactory

class PlaygroundPreviewProvider : PreviewParameterProvider<PlaygroundUiState> {

    override val values = sequenceOf(
        PlaygroundUiStateFactory.mock(),
    )

}
