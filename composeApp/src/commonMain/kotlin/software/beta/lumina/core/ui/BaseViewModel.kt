package software.beta.lumina.core.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import software.beta.lumina.core.ui.components.ecosystem.UiState

abstract class BaseViewModel<S : UiState>(
    initialState: S? = null,
) : ViewModel() {

    private val _uiState = MutableStateFlow(initialState)
    val uiState = _uiState.asStateFlow()

    protected fun updateState(function: (S?) -> S?) {
        _uiState.update(function)
    }

}
