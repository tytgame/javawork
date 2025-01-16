package _02_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class T01_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		// 추가
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(1, 15);
		list.addFirst(100);		// list()에는 없는 메소드
		list.addLast(600);		// list()에는 없는 메소드
//		list.add(0, 100);
		
		for(Integer in : list) {
			System.out.println(in);
		}
		
		// 삭제
		list.remove(1);
		System.out.println(list);

		list.remove();	// 맨 앞의 노드 삭제
		System.out.println(list);
		
		list.removeLast();	// 맨 뒤의 노드 삭제
		System.out.println(list);
		
		
	}

}
