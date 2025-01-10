package chap10_polymorphism;

public class Pet_Answer {
	private String kind;
	private String color;
	private String feature;
	
	Pet_Answer(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	void sound() {
		System.out.println("울음 소리");
	}
	void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	}
	
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
		return
		"종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
