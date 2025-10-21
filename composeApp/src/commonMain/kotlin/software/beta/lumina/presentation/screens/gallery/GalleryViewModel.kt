package software.beta.lumina.presentation.screens.gallery

import kotlinx.coroutines.flow.asSharedFlow
import software.beta.lumina.core.common.BaseViewModel
import software.beta.lumina.core.common.ext.NavigationFlow
import software.beta.lumina.navigation.args.PlaygroundArgs
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiState
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiStateFactory

class GalleryViewModel : BaseViewModel<GalleryUiState>() {

    private val _navigateToPlayground = NavigationFlow<PlaygroundArgs>()
    val navigateToPlayground = _navigateToPlayground.asSharedFlow()

    init {
        updateState { _ -> GalleryUiStateFactory.create() }
    }

    fun onShaderClick(shader: String) {
        PlaygroundArgs(
            shader = shader,
        ).also { args -> _navigateToPlayground.tryEmit(args) }
    }

}
