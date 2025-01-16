package _03_ex;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book() { }
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
		
	String setTitle(String title) {
		return this.title = title;
	}	
	String setAuthor(String author) {
		return this.author = author;
	}
	String setPublisher(String publisher) {
		return this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}	
	String getAuthor(String author) {
		return author;
	}
	String getPublisher(String publisher) {
		return publisher;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + "저자 : " + author + "출판사 : " + publisher;
	}
}

