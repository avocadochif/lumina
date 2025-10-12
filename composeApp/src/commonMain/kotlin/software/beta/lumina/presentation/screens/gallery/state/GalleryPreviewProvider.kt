package software.beta.lumina.presentation.screens.gallery.state

import org.jetbrains.compose.ui.tooling.preview.PreviewParameterProvider

class GalleryPreviewProvider : PreviewParameterProvider<GalleryUiState> {

    override val values = sequenceOf(
        GalleryUiStateFactory.mock(),
    )

}
