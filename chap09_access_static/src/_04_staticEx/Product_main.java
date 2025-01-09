package _04_staticEx;

public class Product_main {

	public static void main(String[] args) {
		
//		Product p1 = new Product(34234);
//		Product p2 = new Product(4324);
//		Product p3 = new Product(324);
//		Product p4 = new Product(12344);
//		System.out.println("생산된 제품의 합계는 " + p1.sum() + " 개 입니다.");
//		Product p5 = new Product(5532);
//		Product p6 = new Product(43422);
//		Product p7 = new Product(113);
//		// TODO : 반복문 가능? -> 가능은 한데 굳이 ......
//		System.out.println("생산된 제품의 합계는 " + p1.sum() + " 개 입니다.");
//		// TODO : 고유한 번호 어떻게 받음?
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품번호 : " + p1.serialNo);
		System.out.println("p2 제품번호 : " + p2.serialNo);
		System.out.println("p3 제품번호 : " + p3.serialNo);
		System.out.println("생산된 총 제품의 수 : " + Product.count);
		
//		for(int i=0;i<7;i++) {
//			Product (p + i) = new Product();
//		}
		
		/*
		Product
		고유의 제품번호 (더조은1)
		제품의 갯수(객체가 생성된 갯수)
		
		Product p1 = new Product(); // 고유한 제품번호 (더조은1)
		


		 */
	}

}
