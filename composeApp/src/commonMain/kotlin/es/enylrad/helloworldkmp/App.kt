package es.enylrad.helloworldkmp

import androidx.compose.runtime.Composable
import coil3.ImageLoader
import coil3.compose.setSingletonImageLoaderFactory
import coil3.request.crossfade
import es.enylrad.helloworldkmp.ui.screens.detail.DetailScreen
import es.enylrad.helloworldkmp.ui.screens.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    setSingletonImageLoaderFactory { context ->
        ImageLoader.Builder(context)
            .crossfade(true)
            //.logger(DebugLogger())
            .build()

    }
    DetailScreen()
}