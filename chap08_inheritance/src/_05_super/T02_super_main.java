package _05_super;
class Parent2 {
	int x = 10;		// 인스턴스 변수
}

class Child2 extends Parent2 {
	int x = 200;	// 인스턴스 변수
	void show() {
		System.out.println("x= " + x);	// 지역변수 -> 인스턴스 변수 -> 부모변수, 200
		System.out.println("this.x= " + this.x);	// 인스턴스 변수 -> 부모변수, 200
		System.out.println("super.x= " + super.x);	// 부모의 변수, 10
	}
}

public class T02_super_main {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.show();

	}

}
