package software.beta.lumina.presentation.screens.playground.state

import software.beta.lumina.navigation.args.PlaygroundArgs

object PlaygroundUiStateFactory {

    // region factory

    fun create(args: PlaygroundArgs): PlaygroundUiState {
        return PlaygroundUiState(
            shader = args.shader,
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
