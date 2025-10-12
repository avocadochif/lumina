package software.beta.lumina.presentation.screens.clickme

import software.beta.lumina.core.common.BaseViewModel
import software.beta.lumina.presentation.screens.clickme.state.ClickMeUiState
import software.beta.lumina.presentation.screens.clickme.state.ClickMeUiStateFactory
import software.beta.lumina.presentation.screens.clickme.state.toggleVisibility

class ClickMeViewModel : BaseViewModel<ClickMeUiState>() {

    init {
        updateState { _ -> ClickMeUiStateFactory.create() }
    }

    fun onToggleVisibilityClick() {
        updateState { state ->
            state?.toggleVisibility()
        }
    }

}
