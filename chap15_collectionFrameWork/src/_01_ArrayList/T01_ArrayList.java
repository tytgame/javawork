package _01_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * List 계열
   - 특징 : 순서가 있다
    	   중복저장 가능
   1. AarrayList : 싱글스레드에서 사용
	 * 제네릭
	   	 ArrayList<자료형> => 모든 자료형을 받을 수 있도록 만듦
	   	 					 사용할 때 자료형을 넣어주면 됨
   	 * 초기배열 10개 : 10개를 초과하여 넣으면 배수만큼 더 만들어 줌
   	 * 배열 지정할 수 있음 : new ArrayList<>(배열의 갯수);	
   	 * 부모 자료형으로 형변환하여 많이 사용함
   	 	List<자료형> 변수명 = new ArrayList<>();
   	 	
   2. Vector : ArrayList와 동일하게 사용(멀티스레드에서 사용)
   3. LinkedList
   
 */
public class T01_ArrayList {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<>();	
		List<String> list = new ArrayList<>();
		// 배열에 넣을 때 : add()
		list.add("java");
		list.add("oracle");
		
		list.add("html");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		
		list.add(2, "css");		// -> 2번에 "css" 넣기
		
		for(int i=0;i<list.size();i++) {
		// 얻어올때 : get(index번호) 사용. list[index] -> 안됨
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println("----------------------------------");
		/*for(String str : list) {
			System.out.println(str);
		}
		*/
		System.out.println(list.get(3));
		System.out.println("---------------------------------");
		/*

		 삭제 : Object remove(index),
		 	   boolean remove(객체),
		 	   clear() : 모두 삭제
		  
		 */
		
		System.out.println("삭제한 객체 : " + list.remove(2));
		
		list.remove("oracle");
		System.out.println("oracle 삭제 후 ");
		for(String str : list) {
			System.out.println(str);
		}
		
		list.clear();
		System.out.println(list.size());
		
		
		
		
	}

}
