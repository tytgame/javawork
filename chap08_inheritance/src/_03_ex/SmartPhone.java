package _03_ex;

public class SmartPhone extends Phone{

	// 방법 1
	SmartPhone(String model, String color) {
		super(model, color);
	}

	// 방법 2
	/*
	SmartPhone() {
		super("삼성", "흰색");   <-- super는 반드시 있어야함, 안에있는 내용은 중요 X
	}
	*/
	
	// 방법 3, 일반적으로 이렇게 함
	
	SmartPhone() {
		this("삼성", "흰색");		// 나의 다른 생성자를 호출
	}
	 

	String search(String search) {
		System.out.println("검색어를 입력하세요 : " + search);
		return "검색 완료";
	}
}
