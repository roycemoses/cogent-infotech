package user_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user_app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}