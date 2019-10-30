package bookext;
import book.Book;
public class EnglishBook extends Book {
	private int publishedYear; //출판년도

	public EnglishBook(int code, String name, int publishedYear) {
		super(code, name);
		this.publishedYear=publishedYear;
	}
	
	public int getPublishedYear() {return this.publishedYear;}
}
