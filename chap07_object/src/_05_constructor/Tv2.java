package _05_constructor;

public class Tv2 {
	String company;
	String model;
	int inch;
	
	// 반드시 괄호안에 변수 개수만큼 main에 넣어야 함. 그래야 객체 생성가능
	Tv2(int inch1) {
		inch = inch1;
	}
	
	
	Tv2(String company1, String model1, int inch1) { // <-- 매개변수가 없으면 Tv2 tv2 = new Tv2(); 이런식으로 만들면 됨
		company = company1;
		model = model1;
		inch = inch1;

		
		
		
	
	}
}
