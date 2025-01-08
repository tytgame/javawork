package _05_super;
class Parent3 {
	void show() {
		System.out.println("부모 클래스 메소드");
	}
}

class Child3 extends Parent3 {
	void show() {
		System.out.println("자식 클래스 메소드");
	}
	void display() {
		show();		// "자식 클래스 메소드"
		super.show();	// "부모 클래스 메소드"
	}
}
public class T03_superMethod_main {

	public static void main(String[] args) {
		Child3 child = new Child3();
		
		child.show();	// 부모 메소드 호출 X
		child.display();
		
		
		
	}

}
