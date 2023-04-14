package spring_movie_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring_movie_app.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> { // pass in the object (Movie) and the primary key data type
	
}

