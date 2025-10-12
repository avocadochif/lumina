package software.beta.lumina.presentation.screens.playground

import software.beta.lumina.core.common.BaseViewModel
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiState
import software.beta.lumina.presentation.screens.playground.state.PlaygroundUiStateFactory

class PlaygroundViewModel : BaseViewModel<PlaygroundUiState>() {

    init {
        updateState { _ -> PlaygroundUiStateFactory.create() }
    }

}
