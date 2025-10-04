package software.beta.lumina.presentation.screens.clickme.state

fun ClickMeUiState.toggleVisibility(): ClickMeUiState {
    return copy(
        isContentVisible = !isContentVisible,
    )
}
