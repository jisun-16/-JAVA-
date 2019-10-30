package book;

public class Book { 
	private int code;  // 책 코드
	private String title; // 책 제목   

	public Book(int code, String title) {
		this.code=code;
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getCode() {return this.code;}
}
