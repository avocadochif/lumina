package software.beta.lumina.presentation.screens.gallery.state

import kotlinx.collections.immutable.ImmutableList
import software.beta.lumina.core.ui.components.ecosystem.UiState

data class GalleryUiState(
    val shaders: ImmutableList<String>,
) : UiState
