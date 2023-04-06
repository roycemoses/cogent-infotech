package book_dao_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import book_dao.BookDAO;
import book_dao_rowmapper.BookDAORowMapper;
import book_pojo_javabean_dto.Book;

@Component("BookDAOImpl")
public class BookDAOImpl implements BookDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DriverManagerDataSource dataSource;
	
	@Override
	public int create(Book book) {
		String sql = "INSERT INTO Book VALUES(?, ?, ?)";
		int result = jdbcTemplate.update(sql, book.getId(), book.getName(), book.getPrice());
		return result;
	}

	@Override
	public Book read(int id) {
		String sql = "SELECT * FROM Book WHERE book_id = ?";
		Book result = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BookDAORowMapper());
		return result;
	}
	
	@Override
	public List<Book> read() {
		String sql = "SELECT * FROM Book";
		List<Book> result = jdbcTemplate.query(sql, new BookDAORowMapper());
		return result;
	}

	@Override
	public int update(Book book) {
		String sql = "UPDATE Book SET book_name = ?, book_price = ? WHERE book_id = ?";
		int result = jdbcTemplate.update(sql, book.getName(), book.getPrice(), book.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM Book WHERE book_id = ?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	
	
}
