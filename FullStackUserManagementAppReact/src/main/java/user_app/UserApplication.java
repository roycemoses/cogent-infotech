package user_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import user_app.entity.User;
import user_app.repository.UserRepository;

@SpringBootApplication
public class UserApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("1", "Royce", "Moses", "royce.kmoses@gmail.com", "https://media.licdn.com/dms/image/D5603AQFasmyHtltzOw/profile-displayphoto-shrink_400_400/0/1665798386640?e=1689206400&v=beta&t=-pt___BU06XzFQZ9YNIq8oR3FhEwQ4syVM6YP8K5MdY"));
		userRepository.save(new User("2", "Chris", "Evans", "chris.evans@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/3/33/Mark_Kassen%2C_Tony_C%C3%A1rdenas_and_Chris_Evans_%28cropped%29.jpg"));
		userRepository.save(new User("3", "Scarlett", "Johansson", "scarlett.johansson@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/2/26/Scarlett_Johansson_by_Gage_Skidmore_2019.jpg"));
		
	}

}
