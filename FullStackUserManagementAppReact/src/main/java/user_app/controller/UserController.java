package user_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user_app.entity.User;
import user_app.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000/")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("users")
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@DeleteMapping("users/id={userID}")
	public void delete(@PathVariable String userID) {
		userRepository.deleteById(userID);
	}
	
	@PostMapping("users")
	public User add(@Validated @RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	@PutMapping("users")
	public void update(@Validated @RequestBody User user) {
		userRepository.save(user);
	}
}
