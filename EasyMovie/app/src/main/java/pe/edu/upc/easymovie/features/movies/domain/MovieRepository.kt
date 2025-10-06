package pe.edu.upc.easymovie.features.movies.domain

interface MovieRepository {
    suspend fun getAllMovies(): List<Movie>

    suspend fun insertFavorite(movie: Movie)

    suspend fun deleteFavorite(movie: Movie)
}