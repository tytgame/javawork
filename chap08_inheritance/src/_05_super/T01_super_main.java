package _05_super;
class Parent {
	int x = 10;		// 인스턴스 변수
}

class Child extends Parent {
	int x = 200;	// 인스턴스 변수
	void show() {
		int x = 500;	// 지역변수
		System.out.println("x= " + x);	// 지역변수 					  (우선순위 1)
		System.out.println("this.x= " + this.x);		// 인스턴스 변수  (우선순위 2)
		System.out.println("super.x= " + super.x);	// 부모의 변수 	  (우선순위 3)
	}
}

public class T01_super_main {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();

	}

}
