package _06_ex;

public class Book {
	// 속성
	String writer;
	int ISBN; // 숫자 5개
	int price;
	
	// 생성자 4개 오버로딩
	Book() {
		this("java", 22222, 121211);
	}
	
	Book(String writer) {
		this(writer, 0, 0);
//		System.out.println(writer);
	}
	
	Book(String writer, int ISBN) {
		this(writer, ISBN, 0);
//		System.out.println(writer + " " + ISBN);
	}

	
	Book(String writer, int ISBN, int price) {
		this.writer = writer;
		this.ISBN = ISBN;
		this.price = price;
		
//		System.out.println(writer + " " + ISBN + " " + price);
	}
	

}
