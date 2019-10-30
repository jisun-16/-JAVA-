package bookext;
import book.Book;
public class ComputerBook extends Book {
	private int stock; //재고 수

	public ComputerBook(int code, String title, int stock) {
		super(code, title);
		this.stock=stock;
	}
	
	public int getStock() {return this.stock;} 
}
