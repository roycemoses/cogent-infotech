package spring_movie_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import spring_movie_app.entity.Movie;

@Service
public interface MovieService {
	
	public Optional<Movie> get(Long movieID);
	public List<Movie> getAll();
	public Movie save(Movie movie);
	public Movie update(Movie movie);
	public void delete(Long movieID);
	
	
}