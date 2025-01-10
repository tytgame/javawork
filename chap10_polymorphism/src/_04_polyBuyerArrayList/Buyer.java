package _04_polyBuyerArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 500;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	
	void buy(Product p) {	//  예를들어 이런식으로 실행됨  b.buy(new Tv()); -> cart[0] = p
		if (money < p.price) {				//  	 b.buy(new Computer()) -> cart[1] = p
			System.out.println("잔액부족");
			return;		
		}	
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);	// p 주소를 cart 맨 앞에 넣는다
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
		
		if(cart.isEmpty()) {
			System.out.println("구입한 물품이 없습니다");
			return;		// 메소드 바깥으로 나감
		}
		
		for(int i=0;i<cart.size();i++) {	// .size() --> 배열에 들어있는 항목의 개수
			Product p1 = cart.get(i);	// p1 --> 카트의 배열, 꼭 안써도 됨
			sum += p1.price;
			list += p1 + ", ";
		}
		
		System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
		System.out.println("구입한 물품 목록 : " + list);
	}
	
	void refund(Product p) {		// 반품
		if(cart.remove(p)) {	// remove() 자체가 존재하는지 먼저 확인을 한 다음 -> 삭제함
								// 존재하면 true 출력해서 검증 완료
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "반품 완료");
		} else {
			System.out.println("구입하지 않은 물품입니다");
			}
		}

//	
//	void refund2(Product p2) {		// 반품 2
//		if(cart.contains(p2) ) {
//			cart.remove(p2);
//			money += p2.price;
//			bonusPoint -= p2.bonusPoint;
//			System.out.println(p2 + "반품 완료2");
//		} else {
//			System.out.println("구입하지 않은 물품입니다2");
//		}
//	
//	}
	
//	void refund(Product p) {		// 반품 3 
//		if(cart.remove(p)) {	
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//			System.out.println(p + "반품 완료");
//		} else {
//			System.out.println("구입하지 않은 물품입니다");
//		}
//}
}