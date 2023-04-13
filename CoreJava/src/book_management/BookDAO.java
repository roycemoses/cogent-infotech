package book_management;

import java.util.ArrayList;

public interface BookDAO {
	
	public void add(int n);
	public void update(int bookID);
	public void delete(int bookID);
	public void find(int bookID);
	public void print();

}
