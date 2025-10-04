package software.beta.lumina.presentation.screens.clickme.state

import org.jetbrains.compose.ui.tooling.preview.PreviewParameterProvider

class ClickMePreviewProvider : PreviewParameterProvider<ClickMeUiState> {

    override val values = sequenceOf(
        ClickMeUiStateFactory.mock()
    )

}
