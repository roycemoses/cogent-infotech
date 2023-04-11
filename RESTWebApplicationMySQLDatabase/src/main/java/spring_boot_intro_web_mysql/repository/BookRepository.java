package spring_boot_intro_web_mysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring_boot_intro_web_mysql.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> { // pass in the object (Book) and the primary key data type
	
}
