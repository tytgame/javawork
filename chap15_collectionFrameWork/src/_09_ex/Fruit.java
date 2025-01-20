package _09_ex;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Fruit o) {	
		if(price<o.price)
			return -1;
		else if(price==o.price)
			return 0;
		else
			return 1;
	}
	@Override
	public String toString() {
		return "Fruit ( name=" + name + ", price=" + price + ")";
	}
}

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;	 // 내림차순 정렬
		}
		return -1;
	}
	
}
