package _06_tree;

import java.util.TreeSet;

public class T01_treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println("가장 낮은 점수 : " + scores.first());	// 75
		System.out.println("가장 높은 점수 : " + scores.last());	// 98
		
		System.out.println("95점 보다 한단계 낮은 점수 : " + scores.lower(95));	// 87
		System.out.println("95점 보다 한단계 높은 점수 : " + scores.higher(95));	// 98
		
		System.out.println("95점이거나 한단계 낮은 점수 : " + scores.floor(95));	// 95		
		System.out.println("81점이거나 한단계 낮은 점수 : " + scores.floor(81));	// 80		
		
		System.out.println("95점이거나 한단계 높은 점수 : " + scores.ceiling(95));	// 95		
		System.out.println("81점이거나 한단계 높은 점수 : " + scores.ceiling(81));	// 87		
		
		System.out.println("총 객체 수 : " + scores.size());
		
		while(!scores.isEmpty()) {
			System.out.println("첫 번째 노드 삭제 : " + scores.pollFirst());		// 제일 작은 노드 삭제
			System.out.println("총 객체 수 : " + scores.size());			
		}
		
		
		
		

	}

}
