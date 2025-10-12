package software.beta.lumina.presentation.screens.gallery.state

import kotlinx.collections.immutable.persistentListOf

object GalleryUiStateFactory {

    // region factory

    fun create(): GalleryUiState {
        return GalleryUiState(
            shaders = persistentListOf(
                "shader 1",
                "shader 2",
                "shader 3",
                "shader 4",
                "shader 5",
                "shader 6",
                "shader 7",
                "shader 8",
                "shader 9",
                "shader 10",
                "shader 11",
                "shader 12",
                "shader 13",
                "shader 14",
                "shader 15",
            ),
        )
    }

    // endregion

    // region mock

    fun mock(): GalleryUiState {
        return GalleryUiState(
            shaders = persistentListOf(
                "shader 1",
                "shader 2",
                "shader 3",
                "shader 4",
                "shader 5",
                "shader 6",
                "shader 7",
                "shader 8",
                "shader 9",
                "shader 10",
                "shader 11",
                "shader 12",
                "shader 13",
                "shader 14",
                "shader 15",
            ),
        )
    }

    // endregion

}
