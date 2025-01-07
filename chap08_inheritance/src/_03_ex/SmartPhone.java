package _03_ex;

public class SmartPhone extends Phone{

	SmartPhone(String model, String color) {
		super(model, color);
	}

	
	String search(String search) {
		System.out.println("검색어를 입력하세요 : " + search);
		return search;
	}
	

}
