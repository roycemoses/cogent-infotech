package spring_boot_security_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring_boot_security_app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String name); // JpaRepository knows how to return User based on its syntax: "findBy{param}"
	
}
