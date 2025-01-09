package _02_polyBuyer;

public class Buyer {
	int money = 500;
	int bonusPoint;
	
	/* 제품의 갯수만큼 오버로딩을 해야함 -- > 형변환으로 한줄로 해결
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	void buy(GameDevice gd) {
		
	}
	*/
	
	// 형변환을 하면 모든 제품을 다 받을 수 있다
	void buy(Product p) {	// 매개변수가 Product
		if (money < p.price) {
			System.out.println("잔액부족");
			return;		// 메소드 빠져나옴
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
	
}
