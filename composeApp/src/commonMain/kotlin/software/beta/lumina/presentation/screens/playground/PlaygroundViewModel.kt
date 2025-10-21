package software.beta.lumina.presentation.screens.playground

import software.beta.lumina.core.common.BaseViewModel
import software.beta.lumina.navigation.args.PlaygroundArgs
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiState
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiStateFactory

class PlaygroundViewModel : BaseViewModel<PlaygroundUiState>() {

    fun onCreate(args: PlaygroundArgs) {
        updateState { _ -> PlaygroundUiStateFactory.create(args) }
    }

}
