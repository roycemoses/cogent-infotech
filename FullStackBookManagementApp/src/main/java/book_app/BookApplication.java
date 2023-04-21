package book_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import book_app.entity.Book;
import book_app.repository.BookRepository;

@SpringBootApplication
public class BookApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save(new Book("To Kill a Mockingbird", 19.60f));
		bookRepository.save(new Book("Fahrenheit 451", 19.53f));
		bookRepository.save(new Book("The Lion, the Witch and the Wardrobe", 19.50f));
		
	}

}
