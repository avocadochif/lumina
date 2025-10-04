package software.beta.lumina.core.ui.components.ecosystem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import software.beta.lumina.core.ui.BaseViewModel

@Composable
inline fun <reified VM, reified S> Screen(
    modifier: Modifier,
    viewModel: VM, //todo: migrate to Koin
    crossinline content: @Composable BoxScope.(viewModel: VM, uiState: S) -> Unit,
) where VM : BaseViewModel<S>, S : UiState {
    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value

    Surface(
        modifier = modifier,
        content = {
            Box(
                modifier = Modifier.fillMaxSize(),
                content = {
                    when (uiState == null) {
                        true -> return@Surface
                        false -> content(viewModel, uiState)
                    }
                },
            )
        },
    )
}
