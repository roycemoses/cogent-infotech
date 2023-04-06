package book_dao;

import java.util.List;

import book_pojo_javabean_dto.Book;

public interface BookDAO {

	// CRUD
	int create(Book employee);
	Book read(int id);
	int update(Book employee);
	int delete(int id);
	
	// Read all employee records
	List<Book> read();
	
}
