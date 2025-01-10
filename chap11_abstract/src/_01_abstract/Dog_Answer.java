package _01_abstract;

public class Dog_Answer extends Pet_Answer {
	Dog_Answer() {
		this("똥개", "누렁이","똥을 잘먹음");
	}
	
	Dog_Answer(String kind, String color, String feature) {
		super(kind, color, feature); // 사용자에게 받은 값을 부모에게 넘겨줌
	}
	void sound() {
		System.out.println("멍멍");
	}
	/*	@Override
		void sound() {
			System.out.println("멍멍");
		}*/
}
