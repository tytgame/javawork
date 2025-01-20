package _10_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu extends LibraryController{
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int select;
		do {
			System.out.println("*************** 메뉴 *************");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("0. 종료");
			System.out.println("--------------------------------");
			System.out.println("메뉴 번호 선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:	//
				insertBook();
				break;
			case 2:	//
				selectList();
				break;
			case 3:	//
				searchBook();
				break;
			case 4:	//
				deleteBook();
				break;
			case 5:	//
				ascBook();
				break;
			case 0:
				System.out.println();
				return;		// menu 메소드 종료
			default:
				System.out.println("잘못 선택했습니다. 다시 선택해 주세요");
			}
		
		}
		while(0 != select);
		}
	
	
	
	
	void insertBook() {									// 새 도서 추가
		System.out.println("추가할 책 정보를 입력하세요 : ");
		String title = sc.next();
		String author = sc.next();
		String publisher = sc.next();
		aList.add(new Book(title, author, publisher));
	}
	
	ArrayList<Book> selectList() {		// 전체 도서 조회
		System.out.println("전체 도서를 검색합니다");
		System.out.println(aList);
		return null;
	}
	void searchBook() {
		System.out.println("검색할 도서명을 입력하세요 : ");
		String bookTitle = sc.next();
		
		
		
		
	}
	
	
	
	
	
	
	void deleteBook() {	// 도서 삭제
		//	aList.remove();
	}
	void ascBook() {	// 도서명 오름차순 정렬
		
	}
}

