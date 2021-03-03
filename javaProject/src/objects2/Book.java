package objects2;

public class Book { // 도서정보
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;
	
	//using filed
	public Book(String bookTitle, String bookAuthor, String bookPress, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookPress;
		this.bookPrice = bookPrice;
	}
	
	//getter and setter
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPress() {
		return bookPress;
	}
	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	
	
	


}
