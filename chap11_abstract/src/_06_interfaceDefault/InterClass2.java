package _06_interfaceDefault;

public class InterClass2 implements Inter2, Inter {

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int method() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String me() {
		return "클래스에서 오버라이딩";
	}
	@Override
	public String me2() {
		return "클래스에서 오버라이딩2";
	}
	// static method()는 오버라이딩 안됨
	/*
	@Override
	
	public String stMe() {
		return "오버라이딩";
	}
	*/

}
