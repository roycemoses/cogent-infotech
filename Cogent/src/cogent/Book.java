package cogent;

public class Book {
	
	// data members
	int bookNum;
	String bookName;
	float bookPrice;
	String authorName;
	
	public Book() {
	
	}

	public Book(int bookNum, String bookName, float bookPrice, String authorName) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
}
