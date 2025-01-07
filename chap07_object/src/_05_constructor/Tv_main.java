package _05_constructor;

public class Tv_main {

	public static void main(String[] args) {
		Tv tv1 = new Tv();		// 아무것도 안넣었으면 기본 생성자 (메소드) 생성
		Tv tv2 = new Tv("삼성");	// 문자열을 넣으면 String company1 메소드 생성
		Tv tv3 = new Tv("LG", "HD", 55);
		
		Tv2 tv2_1 = new Tv2("삼성", "HD", 65);
		Tv2 tv2_2 = new Tv2("LG", "울트라", 55);
	}
}