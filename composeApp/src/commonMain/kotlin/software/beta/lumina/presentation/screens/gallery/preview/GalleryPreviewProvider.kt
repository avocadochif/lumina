package software.beta.lumina.presentation.screens.gallery.preview

import org.jetbrains.compose.ui.tooling.preview.PreviewParameterProvider
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiState
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiStateFactory

class GalleryPreviewProvider : PreviewParameterProvider<GalleryUiState> {

    override val values = sequenceOf(
        GalleryUiStateFactory.mock(),
    )

}
