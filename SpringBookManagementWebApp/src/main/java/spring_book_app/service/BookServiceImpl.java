package spring_book_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_book_app.entity.Book;
import spring_book_app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Optional<Book> get(Long bookID) {
		return bookRepository.findById(bookID);
	}

	@Override
	public List<Book> getAll() {
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public void delete(Long bookID) {
		bookRepository.deleteById(bookID);
	}

	@Override
	public Book update(Book book) {
//		book.setBookID(bookID);
		return bookRepository.save(book);
	}

	
}