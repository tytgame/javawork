package _06_ex;

public class Book_main {

	public static void main(String[] args) {
		// 저자, ISBN(숫자 5개), 가격
		Book book0 = new Book();
		
		
		Book book1 = new Book("홍길동", 12344, 10000);
		System.out.print(book1.writer + " ");
		System.out.print(book1.ISBN + " ");
		System.out.println(book1.price);
		
		System.out.println("--------------------");

		Book book2 = new Book("oracle", 32142);
		System.out.print(book2.writer + " ");
		System.out.println(book2.ISBN);
		
		
	}

}
