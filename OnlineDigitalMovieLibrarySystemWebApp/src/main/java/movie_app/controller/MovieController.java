package movie_app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import movie_app.entity.Movie;
import movie_app.service.MovieService;


@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@PostMapping("/movies")
	public Movie add(@Validated @RequestBody Movie movie)
	{
		return movieService.save(movie);
	}
	
	@GetMapping("/movies/id={movieID}")
	@ResponseBody
	public Optional<Movie>get(@PathVariable Long movieID)
	{
		return movieService.get(movieID);
	}
	
	@GetMapping("/movies")
	public List<Movie> getAll() {
		return movieService.getAll();
	}
	
	@DeleteMapping("/movies/id={movieID}")
	public void delete(@PathVariable Long movieID) {
		movieService.delete(movieID);
	}
	
	@PutMapping("/movies")
	public void update(@Validated @RequestBody Movie movie) {
		movieService.update(movie);
	}
	
		
}

