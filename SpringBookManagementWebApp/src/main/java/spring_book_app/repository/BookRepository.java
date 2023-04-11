package spring_book_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring_book_app.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> { // pass in the object (Book) and the primary key data type
	
}

