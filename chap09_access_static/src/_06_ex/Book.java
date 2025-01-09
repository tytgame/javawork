package _06_ex;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	Book(){}	// 빈 생성자
	
//	Book(String title, String author, int price) { // 모든 매개변수를 받는 생성자
//		this(title, author, price, "abc");
		
		/*
		this(title, author, price, "abc");
		위 문장처럼 쓰는 대신 아래 문장처럼 써도됨, 기능은 같음
		this.title = title;
		this.author = author;
		this.price = price;
		publisher = "abc";
		*/
//	}
	Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// getter 메소드
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	int getPrice() {
		return price;
	}
	String getPublisher() {
		return publisher;
	}
	
	// setter 메소드
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 모든 필드값을 리턴해주는 메소드
	void search(String name) {
		if(name.equals(title)) { // 책 제목이 있으면 책 정보 출력
			System.out.println("책 제목 : " + title);
			System.out.println("저자 : " + author);
			System.out.println("가격 : " + price);
			System.out.println("출판사 : " + publisher);
		} else {
			System.out.println("책이 없습니다");// 책 제목으로 검색이 안되면 "책이 없습니다" 출력
		}
	}
}
