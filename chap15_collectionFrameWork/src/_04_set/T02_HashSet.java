package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	String aa;
	A(String aa) {
		this.aa = aa;
	
	}
}
public class T02_HashSet {

	public static void main(String[] args) {
		Set<A> set1 = new HashSet<>();		// Hash 타입의 Set 객체 set1 생성
		A a1 = new A("c");
		
		set1.add(new A("a"));
		set1.add(new A("b"));
		set1.add(a1);						// 객체 a1 추가
		set1.add(new A("d"));
		set1.add(new A("e"));				// "a", "b", "c", "d", "e" 라는 값을 가진 A 객체를 set1에 추가
		
		System.out.println("size : " + set1.size());	// HashSet의 크기 출력
		
		Iterator<A> iter = set1.iterator();
		while(iter.hasNext()) {		// set1의 값을 순차적으로 출력
			A str = iter.next();	// 다음 요소를 가져옴
			System.out.print(str.aa + " ");		// 요소의 'aa' 필드 값을 출력
		}
		System.out.println("\n---------------------");
		
		// 삭제 불가 : 주소를 알 수 없음
		set1.remove(new A("b"));	// A("b") 객체를 새로 만들어서 삭제 시도
		
		iter = set1.iterator();
		while(iter.hasNext()) {		// 삭제 후 다시출력
			A str = iter.next();
			System.out.println(str.aa + " ");	// 요소의 'aa'필드 값 출력
		}
		
		System.out.println("---------------------");

		iter = set1.iterator();
		while(iter.hasNext()) {			// set1의 요소들을 순차적으로 탐색하면서 요소 삭제하는 반복문
			A str = iter.next();
			System.out.println(str.aa + " ");	// 요소의 'aa'필드값 출력
			if(str.aa.equals(str))		// 'aa' 필드 값이 자신과 동일한 경우
				iter.remove();			// 해당 요소 삭제
		}
	
		
		
		

	} // main
	
	static void iterPrint(Iterator<A> i) {
		while(i.hasNext()) {
			A str = i.next();
			System.out.println(str.aa + " ");
			}
		System.out.println();
	}
	

}
