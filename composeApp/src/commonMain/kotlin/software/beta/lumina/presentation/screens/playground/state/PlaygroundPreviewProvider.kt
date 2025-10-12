package software.beta.lumina.presentation.screens.playground.state

import org.jetbrains.compose.ui.tooling.preview.PreviewParameterProvider

class PlaygroundPreviewProvider : PreviewParameterProvider<PlaygroundUiState> {

    override val values = sequenceOf(
        PlaygroundUiStateFactory.mock(),
    )

}
