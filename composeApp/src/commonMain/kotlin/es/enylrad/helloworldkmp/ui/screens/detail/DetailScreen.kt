package es.enylrad.helloworldkmp.ui.screens.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import es.enylrad.helloworldkmp.core.model.movies
import es.enylrad.helloworldkmp.ui.screens.Screen
import kmpmovies.composeapp.generated.resources.Res
import kmpmovies.composeapp.generated.resources.back_content_description
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen() {
    val movie = movies[0]
    Screen {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = movie.title) },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                Icons.AutoMirrored.Default.ArrowBack,
                                contentDescription = stringResource(Res.string.back_content_description)
                            )
                        }
                    }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
            ) {
                AsyncImage(
                    model = movie.poster,
                    contentDescription = movie.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16 / 9f)
                )
                Text(
                    text = movie.title,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineMedium
                )
            }

        }
    }
}