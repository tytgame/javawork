package _06_ex;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		// 객체 만들기 1. 기본생성자로 객체를 생성하고 setter 메소드로 값을 넣기
		Book book1 = new Book();
		book1.setTitle("JAVA");
		book1.setAuthor("서민구");
		book1.setPrice(25000);
		book1.setPublisher("김앤북");
		book1.search("JAVA");
		book1.search(book1.getTitle());
		
		// 객체 만들기 2. 매개변수가 있는 생성자를 이용하여 값 넣기
		Book book2 = new Book("ORACLE", "김오라", 30000, "한빛미디어");
		book2.search("ORACLE");
		
		// 사용자로부터 입력받아 값 넣기
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목 입력 : ");
		String title = sc.next();
		System.out.println("책 저자 입력 : ");
		String author = sc.next();
		System.out.println("책 가격 입력 : ");
		int price = sc.nextInt();
		System.out.println("책 출판사 입력 : ");
		String publisher = sc.next();
		
		Book book3 = new Book(title, author, price, publisher);
		
//		System.out.println(book1.search(publisher));
		// 책 제목 검색
		System.out.println("검색할 책 제목 입력 : ");
		String search = sc.next();
		if(search.equals(book1.getTitle())) {
			book1.search(book1.getTitle());
			}
		
		
		Book b = new Book();
		b.setTitle("책 이름");
		b.setAuthor("유예성");
		b.setPrice(5000000);
		b.setPublisher("유명한 출판사");
		b.search("책 이름");
		
		Book b2 = new Book("책 이름2", "유예성", 20000, "안유명");
		b2.search("책 이름 23131");
		
		Book b3 = new Book("가나다", "유예성", 55555, "김");
		b3.search("가나다");
	}

}
