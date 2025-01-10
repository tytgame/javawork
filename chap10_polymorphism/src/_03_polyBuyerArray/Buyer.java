package _03_polyBuyerArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];	// for문 불가능
	int index = 0;
	
	void buy(Product p) {	//  예를들어 이런식으로 실행됨  b.buy(new Tv()); -> cart[0] = p
		if (money < p.price) {				//  	 b.buy(new Computer()) -> cart[1] = p
			System.out.println("잔액부족");
			return;		
		}	
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	
	/*void getInfo() {
		int sum = 0;
		
		System.out.print("구입한 물품 목록 : ");
	//		String list = ""; 
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i] == null) 
				break;
			sum += cart[i].price;
		System.out.print(cart[i] + ", ");
		}
		System.out.println();
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
	}*/
	
	void getInfo() {
		int sum = 0;
		String list = "";
//		Tv, Computer, 
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i] == null) 
				break;
			sum += cart[i].price;
			list += cart[i] + ", ";
		}
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
		System.out.println("구입한 물품 목록 : " + list);
	}
}
