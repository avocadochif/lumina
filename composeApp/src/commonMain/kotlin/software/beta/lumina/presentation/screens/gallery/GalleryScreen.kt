package software.beta.lumina.presentation.screens.gallery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.ui.tooling.preview.PreviewParameter
import software.beta.lumina.core.ui.components.ecosystem.Screen
import software.beta.lumina.core.ui.theme.LuminaTheme
import software.beta.lumina.presentation.screens.gallery.state.GalleryPreviewProvider
import software.beta.lumina.presentation.screens.gallery.state.GalleryUiState

@Composable
fun GalleryScreen(
    modifier: Modifier,
    navigateToPlayground: () -> Unit,
) {
    Screen<GalleryViewModel, GalleryUiState>(
        modifier = modifier,
        viewModel = viewModel { GalleryViewModel() },
        content = { viewModel, state ->
            Content(
                modifier = Modifier.fillMaxSize(),
                state = state,
            )
        },
    )
}

@Composable
private fun Content(
    modifier: Modifier,
    state: GalleryUiState,
) {
    LazyColumn(
        modifier = modifier,
        state = rememberLazyListState(),
        contentPadding = PaddingValues(
            start = 24.dp,
            top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding() + 24.dp,
            end = 24.dp,
            bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding() + 24.dp,
        ),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        content = {
            items(
                items = state.shaders,
                itemContent = { data ->
                    Item(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(172.dp),
                        title = data,
                    )
                },
            )
        },
    )
}

@Composable
private fun Item(
    modifier: Modifier,
    title: String,
) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(24.dp))
            .background(color = MaterialTheme.colorScheme.surfaceContainer),
        contentAlignment = Alignment.Center,
        content = {
            Text(
                text = title,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
            )
        },
    )
}

@Composable
@Preview
private fun ContentPreview(
    @PreviewParameter(GalleryPreviewProvider::class) state: GalleryUiState,
) {
    LuminaTheme(
        darkTheme = false,
        dynamicColor = false,
        content = {
            Surface(
                modifier = Modifier.fillMaxSize(),
                content = {
                    Content(
                        modifier = Modifier.fillMaxSize(),
                        state = state,
                    )
                },
            )
        },
    )
}
