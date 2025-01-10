package chap10_polymorphism;

public class Cat_Answer extends Pet_Answer {
	Cat_Answer() {
		this("페르시안", "흰색","빛나는 카리스마");
	}
	
	Cat_Answer(String kind, String color, String feature) {
		super(kind, color, feature); // 사용자에게 받은 값을 부모에게 넘겨줌
	}
	
	@Override
	void sound() {
		System.out.println("야옹");
	}

}
