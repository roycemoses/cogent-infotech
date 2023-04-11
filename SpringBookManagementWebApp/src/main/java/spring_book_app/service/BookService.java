package spring_book_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import spring_book_app.entity.Book;

@Service
public interface BookService {
	
	public Optional<Book> get(Long bookID);
	public List<Book> getAll();
	public Book save(Book book);
	public Book update(Book book);
	public void delete(Long bookID);
	
	
}