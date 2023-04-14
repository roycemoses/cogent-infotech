package movie_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movie_app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String name); // JpaRepository knows how to return User based on its syntax: "findBy{param}"
	
}
