package software.beta.lumina.core.common.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

@Suppress("ComposableNaming")
@Composable
fun <T> Flow<T>.collectAsEffect(action: suspend (T) -> Unit) {
    val lifecycleOwner = LocalLifecycleOwner.current
    LaunchedEffect(Unit) {
        lifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
            collect { action(it) }
        }
    }
}

@Suppress("FunctionName")
fun <T> NavigationFlow(): MutableSharedFlow<T> {
    return MutableSharedFlow(extraBufferCapacity = 1)
}

