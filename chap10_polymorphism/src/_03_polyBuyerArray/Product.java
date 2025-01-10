package _03_polyBuyerArray;
// 부모
class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price*0.05);
	}
}

