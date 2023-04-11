package spring_book_app.controller;

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

import spring_book_app.entity.Book;
import spring_book_app.service.BookService;


@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/books")
	public Book add(@Validated @RequestBody Book book)
	{
		return bookService.save(book);
	}
	
	@GetMapping("/books/id={bookID}")
	@ResponseBody
	public Optional<Book>get(@PathVariable Long bookID)
	{
		return bookService.get(bookID);
	}
	
	@GetMapping("/books")
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@DeleteMapping("/books/id={bookID}")
	public void delete(@PathVariable Long bookID) {
		bookService.delete(bookID);
	}
	
	@PutMapping("/books")
	public void update(@Validated @RequestBody Book book) {
		bookService.update(book);
	}
	
		
}

