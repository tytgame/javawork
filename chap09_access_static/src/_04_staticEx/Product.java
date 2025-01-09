package _04_staticEx;

public class Product {
	int unique_num; // 고유한 제품번호
	static int count; // 제품의 갯수
	String serialNo; // 고유번호2
	
	Product(int unique_num) {
		this.unique_num = unique_num;
		System.out.println("고유번호: " + unique_num + " / "+ "더조은" + (++count));
	}
	
	Product() {
		serialNo = "더조은" + ++count;
	}

	int sum() {
		return count;
	}
	
	
	
}

