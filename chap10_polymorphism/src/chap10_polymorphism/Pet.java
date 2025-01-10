package chap10_polymorphism;

public class Pet {
	//	속성
	String kind;	
	String color;
	String feature;
	
	//	생성자
	Pet() {}
	
	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	//	메소드
	void sound() {
		System.out.println("소리를 냅니다");
	}
	
	void info() {
		System.out.println("종류 : " + kind);
		System.out.println("색상 : " + color);
	}
	
	// getter 메소드
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Pet";
	}
	
	
	
	
	
	
}

// Cat 클래스
class Cat extends Pet {
	
	Cat() {
		super("", "", "");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	@Override
	void sound() {
		System.out.println("냐옹");
	}
		
} 

// Dog 클래스
class Dog extends Pet {

	Dog() {
		
	}
	
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
} 

// Frog 클래스
class Frog extends Pet {
	
	Frog() {}
	
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
} 







