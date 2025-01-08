package _02_static;

public class T01_static_main {

	public static void main(String[] args) {
		
		/*
		T01_static ts1 = new T01_static();
		ts1.printIn();
		ts1.printSt();
		
		ts1.num = 10;
		ts1.numSt = 100;
		
		System.out.println(ts1.num);	// 10
		System.out.println(ts1.numSt);  // 100
		
		T01_static ts2 = new T01_static();
		System.out.println(ts2.num);	// 5
		System.out.println(ts2.numSt);	// 100, 값이 바뀜
		*/
		
		
		// 정적 필드는 객체를 생성하지 않고도 사용가능
		System.out.println(T01_static.numSt);
		System.out.println(T01_static.nameSt);
		T01_static.printSt();
//		T01_static.printIn(); 정적 메서드가 아니면 호출 불가능
		
		
	}
}
