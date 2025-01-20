package _07_treeMap;

import java.util.Map;
import java.util.TreeMap;

public class T02_treeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		score.put(87, "홍길동");
		score.put(98, "김사람");
		score.put(75, "박사람");
		score.put(81, "이사람");
		score.put(99, "유사람");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = score.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lowerEntry(95);
		System.out.println("95점 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(95);
		System.out.println("95점 바로 위 점수 : " + entry.getKey() + "-" + entry.getValue());

		entry = score.floorEntry(95);
		System.out.println("95점이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
	
		entry = score.ceilingEntry(95);
		System.out.println("95점이거나 바로 위 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.pollFirstEntry();
		System.out.println("삭제된 객체 : " + entry.getValue());
		System.out.println("남은 객체 수 : " + score.size());
		
		
		
		
		
		
		
	
	}

}
