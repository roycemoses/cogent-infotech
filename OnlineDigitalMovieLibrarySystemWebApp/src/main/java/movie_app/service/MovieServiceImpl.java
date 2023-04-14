package movie_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_app.entity.Movie;
import movie_app.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public Optional<Movie> get(Long movieID) {
		return movieRepository.findById(movieID);
	}

	@Override
	public List<Movie> getAll() {
		return (List<Movie>) movieRepository.findAll();
	}

	@Override
	public void delete(Long movieID) {
		movieRepository.deleteById(movieID);
	}

	@Override
	public Movie update(Movie movie) {
//		movie.setMovieID(movieID);
		return movieRepository.save(movie);
	}

	
}