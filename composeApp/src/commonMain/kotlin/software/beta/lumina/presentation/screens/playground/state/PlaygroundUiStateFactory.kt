package software.beta.lumina.presentation.screens.playground.state

object PlaygroundUiStateFactory {

    // region factory

    fun create(): PlaygroundUiState {
        return PlaygroundUiState(
            shader = "shader 1",
        )
    }

    // endregion

    // region mock

    fun mock(): PlaygroundUiState {
        return PlaygroundUiState(
            shader = "shader 1",
        )
    }

    // endregion

}
