package book_management;

public class Book {
	
	private int bookID;
	String bookName;
	float bookPrice;

	public Book()
	{
		this.bookID = 0;
		this.bookName = "";
		this.bookPrice = 0.0f;
	}
	
	public Book(int bookID, String bookName, float bookPrice) 
	{
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}	
}
