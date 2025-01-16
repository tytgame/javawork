package _03_ex;

import java.util.ArrayList;
import java.util.List;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("김이름",99,"남자"));
		
		lc.insertBook();
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
	}

}
