package _03_ex;

public class Phone {
	String model;
	String color;
	
//	Phone(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
	 
	Phone(){}
	
	Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	
	void bell() {
		System.out.println("전화벨이 울립니다");
	}
	
	void hangUp() {
		System.out.println("전화를 받았습니다");
	}
	
	void hangOut() {
		System.out.println("전화를 끊었습니다");
	}
	
	void sendVoice(String message) {
		System.out.println(message);
	}
	
	void receiveVoice() {
		System.out.println("음성메시지를 받았습니다");
	}
}


