package spring_boot_intro_web_mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import spring_boot_intro_web_mysql.entity.Book;

@Service
public interface BookService {
	
	public Optional<Book> get(Long bookID);
	public List<Book> getAll();
	public Book save(Book book);
	public Book update(Book book);
	public void delete(Long bookID);
	
	
}
