package software.beta.lumina.presentation.screens.clickme.state

object ClickMeUiStateFactory {

    // region factory

    fun create(): ClickMeUiState {
        return ClickMeUiState(
            isContentVisible = false,
        )
    }

    // endregion

    // region mock

    fun mock(): ClickMeUiState {
        return ClickMeUiState(
            isContentVisible = false,
        )
    }

    // endregion

}
