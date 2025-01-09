package chap10_polymorphism;
class A{
	int a = 1;
}
class B extends A {
	int b = 2;
}
class C extends A {
	int c = 3;
}
class D extends B {
	int d = 4;
}
class E extends C {
	int e = 5;
}

public class T01_poly_main {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동형 변환 : 자식타입을 부모타입으로 변환
		A a1 = new B();	// b
		A a2 = new C();	// c
		A a3 = new D();	// d
		A a4 = new E();	// e
		
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println("-----------------------------");
		
		// 부모A 타입으로 형변환 했기 때문에 a변수만 사용가능
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a3.a);
		System.out.println(a4.a);
		System.out.println("-----------------------------");
		
		// 부모 B 타입으로 형변환하면 B는 A를 상속받았기 때문에 변수 a,b 사용 가능
		B b1 = d;
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println("-----------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
