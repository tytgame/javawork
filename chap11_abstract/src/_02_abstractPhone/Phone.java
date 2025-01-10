package _02_abstractPhone;

public abstract class Phone {
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
	
	abstract void hangUp();
	abstract void hangOut();
	
	void sendVoice(String message) {
		System.out.println(message);
	}
	
	void receiveVoice() {
		System.out.println("음성메시지를 받았습니다");
	}
}