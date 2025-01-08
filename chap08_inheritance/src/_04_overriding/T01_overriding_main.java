package _04_overriding;
/*
  오버라이딩
  - 상속관계의 메소드에서만 가능
  - 선언부가 같아야 된다
    자식 클래스에서 내용만 다르게 프로그램
  
 */

class Over {	// 부모
	void show(String str) {		// 변수 이름은 상관 X, 쓰고 나면 사라짐
		System.out.println("부모클래스 메소드 : " + str);
	}
	
	void print(String str) {
		System.out.println("부모클래스 print메소드 : " + str);
	}
}

class OverChild extends Over{	// 자식
	void show(String child) {
		System.out.println("자식클래스 메소드 : " + child);
	}
}

public class T01_overriding_main {
	public static void main(String[] args) {
		OverChild oc = new OverChild();
		oc.show("자바 프로그래밍");
		oc.print("2131");	// 내 객체안에 메소드가 있나 제일 먼저 확인 -> 부모한테 올라가서 확인
							// 같은 말 = 자기자신한테 메소드가 있나 먼저 확인하고 있으면 수행
							// 없으면 부모에게 가서 찾아서 있으면 실행
		Over ov = new Over();
		ov.show("오라클");
	}
}
