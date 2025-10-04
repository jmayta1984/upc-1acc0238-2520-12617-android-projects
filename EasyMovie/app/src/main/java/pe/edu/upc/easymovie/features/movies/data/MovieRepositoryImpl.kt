package pe.edu.upc.easymovie.features.movies.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import pe.edu.upc.easymovie.features.movies.domain.Movie
import pe.edu.upc.easymovie.features.movies.domain.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val service: MovieService) : MovieRepository {
    override suspend fun getAllMovies(): List<Movie> = withContext(Dispatchers.IO) {

        try {
            val response = service.getAllMovies()
            if (response.isSuccessful) {
                response.body()?.let { wrapperDto ->
                    return@withContext wrapperDto.movies.map { movieDto ->
                        Movie(
                            id = movieDto.id,
                            title = movieDto.title,
                            overview = movieDto.overview,
                            posterPath = "https://image.tmdb.org/t/p/w500${movieDto.posterPath}"
                        )
                    }

                }
            }
        } catch (e: Exception) {
            return@withContext emptyList()
        }

        return@withContext emptyList()
    }
}