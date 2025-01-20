package _08_comparable;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 트리셋 분류하는 기준 세우기
	// 반드시 해줘야함. 안하면 오류
	@Override
	public int compareTo(Person o) {	
		if(age<o.age)
			return -1;
		else if(age==o.age)
			return 0;
		else
			return 1;
	}
	@Override
	public String toString() {
		return "Person : name=" + name + ", age=" + age;
	}
}			// Person 클래스

public class T01_Comparable {
	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<>();
		treeset.add(new Person("홍길동", 25));
		treeset.add(new Person("김자바", 35));
		treeset.add(new Person("나자바", 27));
		Iterator<Person> iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.name + ":" + p.age);	}
		
		System.out.println(treeset);

	}
}
