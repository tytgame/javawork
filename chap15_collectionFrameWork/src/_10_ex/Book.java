package _10_ex;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String publisher;
	
	public Book() { }
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
		
	public String setTitle(String title) {
		return this.title = title;
	}	
	public String setAuthor(String author) {
		return this.author = author;
	}
	public String setPublisher(String publisher) {
		return this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}	
	public String getAuthor(String author) {
		return author;
	}
	public String getPublisher(String publisher) {
		return publisher;
	}
	
	@Override
	public String toString() {
		return "제목 : " + title + "저자 : " + author + "출판사 : " + publisher;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return title.equals(((Book)obj).title);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}

	
}

