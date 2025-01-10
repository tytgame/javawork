package _01_abstract;

public class Frog_Answer extends Pet_Answer {
	Frog_Answer() {
		this("청개구리", "초록색","말을 안들음");
	}
	
	Frog_Answer(String kind, String color, String feature) {
		super(kind, color, feature); // 사용자에게 받은 값을 부모에게 넘겨줌
	}
	void sound() {
		System.out.println("개굴");
	}
	/*	@Override
		void sound() {
			System.out.println("개굴");
		}*/
}
