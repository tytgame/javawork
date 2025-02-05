package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		HashMap<String, Snack> map = new HashMap<>(); 
//				  key    객체
		
		map.put("새우깡", new Snack("새우맛", 500));
		map.put("포테이토칩", new Snack("감자맛", 600));
		map.put("빼빼로", new Snack("단맛", 700));
		map.put("에이스", new Snack("담백한맛", 200));
		System.out.println(map);
		
		Snack snack = map.get("새우깡");
		System.out.println(snack);
		// 덮어쓰기 됨, replace 효과
		map.put("빼빼로", new Snack("단맛",800));
		System.out.println(map);
		
		// replace(key, value) 위의 19줄과 동일
		map.replace("포테이토칩", new Snack("감칠맛",500));
		System.out.println(map);
		System.out.println("----------------------------------");
		
		// 객체를 하나씩 출력
		// entrySet()
		Set<Entry<String, Snack>> entrySet = map.entrySet(); 	
		// 권장사항
//		Set entry = map.entrySet();								// 이렇게 사용해도 됨
		Iterator<Entry<String, Snack>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Snack> entry = iter.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key + " - " + value);
		}
	
	
	}

}
