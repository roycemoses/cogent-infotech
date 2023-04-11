package spring_book_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_book_app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String name); // JpaRepository knows how to return User based on its syntax: "findBy{param}"
	
}
