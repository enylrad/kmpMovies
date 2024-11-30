package es.enylrad.helloworldkmp.model

data class Movie(
    val id: Int,
    val title: String,
    val pposter: String
)

val movies = (1..100).map {
    Movie(
        id = it,
        title = "Movie $it",
        pposter = "https://picsum.photos/200/300?random=$it"
    )
}