package _02_car;

public class Ambulance extends Car {	// 특별한 기능 (자식)
//	Ambulance() {
//		super("myAm", "삼성");
//	}
	
	public Ambulance(String model, String company) {
		super(model, company); 	 // super : 부모의 생성자 호출
	}

	boolean siren; // false
	
	public void siren() {
		if(siren = !siren) {
			System.out.println("사이렌 울림");
		} else {
			System.out.println("사이렌을 멈춤");
		}
	}
	
	void firstAid() {
		System.out.println("응급처치를 합니다");
	}
	
	
	
}
