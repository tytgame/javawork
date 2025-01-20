package _09_ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparator_main {
	public static void main(String[] args) {
		TreeSet<Fruit> treeset = new TreeSet<>();	// 괄호 안에 new Descending 넣으면
		treeset.add(new Fruit("사과", 5000));			// 내림차순, 없으면 오름차순
		treeset.add(new Fruit("귤", 2000));	
		treeset.add(new Fruit("배", 10000));
		Iterator<Fruit> iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			Fruit f = iterator.next();
			System.out.println(f.name + ":" + f.price);	}
		
		System.out.println(treeset);
		
		// Descending
		System.out.println("------------------------");
		TreeSet<Fruit> treeset2 = new TreeSet<>(new Descending());	// 괄호 안에 new Descending 넣으면
		treeset2.add(new Fruit("과일1", 3000));						// 내림차순, 없으면 오름차순
		treeset2.add(new Fruit("과일2", 7000));
		treeset2.add(new Fruit("과일3", 15000));
		System.out.println(treeset2);
		

	}
}
