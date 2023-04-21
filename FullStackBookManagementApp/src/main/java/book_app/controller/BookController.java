package book_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book_app.entity.Book;
import book_app.repository.BookRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200/")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("books")
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
}
