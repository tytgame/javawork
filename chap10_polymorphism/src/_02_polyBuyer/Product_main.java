package _02_polyBuyer;

public class Product_main {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		System.out.println(b);	// 해시번호가 나옴
		System.out.println("---------------------");
		

		b.buy(new GameDevice());
		b.buy(new Computer());
		b.buy(new Tv());
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점");
		
		b.buy(new Tv());
		
		
		
	}
}
