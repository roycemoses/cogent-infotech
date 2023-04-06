package book_dao_rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import book_pojo_javabean_dto.Book;

public class BookDAORowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

        Book book = new Book();
        book.setId(rs.getInt("book_id"));
        book.setName(rs.getString("book_name"));
        book.setPrice(rs.getFloat("book_price"));

        return book;
    }
}