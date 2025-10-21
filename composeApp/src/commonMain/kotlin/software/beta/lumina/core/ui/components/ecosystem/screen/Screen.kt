package software.beta.lumina.core.ui.components.ecosystem.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import software.beta.lumina.core.common.BaseViewModel

@Composable
inline fun <reified VM, reified S> Screen(
    modifier: Modifier,
    viewModel: VM, //todo: migrate to Koin
    noinline onCreate: ((VM) -> Unit)? = null,
    crossinline content: @Composable BoxScope.(viewModel: VM, uiState: S) -> Unit,
) where VM : BaseViewModel<S>, S : UiState {
    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value

    Surface(
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            when (uiState == null) {
                true -> return@Surface
                false -> content(viewModel, uiState)
            }
        }
    }

    val isInitialize = rememberSaveable(viewModel.hashCode().toString()) {
        mutableStateOf(false)
    }

    LaunchedEffect(isInitialize) {
        if (!isInitialize.value) {
            isInitialize.value = true
            onCreate?.invoke(viewModel)
        }
    }
}
