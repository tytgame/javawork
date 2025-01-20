package _10_ex;

import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		
		lc.insertBook();
		System.out.println("--------------------------");
		System.out.println(lc.selectAll());
		
		lc.insertBook(new Book("springBoot", "박봄이", "위키북스"));
		
		
		System.out.println(lc.selectAll());
		
		Book book = lc.searchBook("java");
		System.out.println("찾은 책 : " + book);
		
		Book book2 = lc.searchBook("java2");
		if(book2 == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println("찾은 책 : " + book2);	
		}
		
		System.out.println("----------------------------");
		
		/*BookMenu bm = new BookMenu();
		bm.insertBook("1", "2", "3");
		bm.addBook("4", "5", "6");
		
		System.out.println(bm.searchAllBooks());
		
		System.out.println(bm.searchBooks("1"));
		bm.deleteBook("1");
		
		System.out.println(bm.searchAllBooks());
		*/
		
		BookMenu bm = new BookMenu();
		bm.menu();

	}
}

