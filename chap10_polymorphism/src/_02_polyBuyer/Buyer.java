package _02_polyBuyer;

public class Buyer {
	int money = 500;
	int bonusPoint;
	
	/*
	  매개변수로 객체를 받음.
	  반환형 메서드이름(클래스명 변수명)
	  	-> 인자값은 반드시 클래스명으로 생성된 객체만 넘겨줘야 한다
	  
	  제품의 갯수만큼 오버로딩을 해야함 -- > 형변환으로 한줄로 해결
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	void buy(GameDevice gd) {
		
	}
	*/
	
	// 형변환을 하면 모든 제품을 다 받을 수 있다
	void buy(Product p) {	// 매개변수가 Product, int double float 처럼 기본 자료형을 넣을 수 있지만
							// String, Product처럼 객체를 넣을 수 있음 / 배열도 가능
		if (money < p.price) {
			System.out.println("잔액부족");
			return;		// 메소드 빠져나옴
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}
