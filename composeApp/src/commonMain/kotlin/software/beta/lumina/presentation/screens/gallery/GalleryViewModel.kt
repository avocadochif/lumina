package software.beta.lumina.presentation.screens.gallery

import software.beta.lumina.core.common.BaseViewModel
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiState
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiStateFactory

class GalleryViewModel : BaseViewModel<GalleryUiState>() {

    init {
        updateState { _ -> GalleryUiStateFactory.create() }
    }

}
