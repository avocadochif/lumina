package software.beta.lumina.presentation.screens.clickme

import software.beta.lumina.core.ui.BaseViewModel
import software.beta.lumina.presentation.screens.clickme.state.ClickMeUiState
import software.beta.lumina.presentation.screens.clickme.state.ClickMeUiStateFactory
import software.beta.lumina.presentation.screens.clickme.state.toggleVisibility

class ClickMeViewModel : BaseViewModel<ClickMeUiState>() {

    init {
        print("init")
        updateState { _ -> ClickMeUiStateFactory.create() }
    }

    fun onToggleVisibilityClick() {
        updateState { state ->
            state?.toggleVisibility()
        }
    }

}
