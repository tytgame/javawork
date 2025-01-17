package _06_tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T02_treeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet();
		Scanner sc = new Scanner(System.in);
		
		/*	while(set.size() < 6) {
				set.add((int)(Math.random()*45)+1);
			}*/
//		System.out.println(set);
		
		System.out.println("금액을 입력하세요(1000원에 한 번) : ");		
		int amount = sc.nextInt();
		
		for(int i=0;i<amount/1000;i++) {
			while(set.size() < 6) {
				set.add((int)(Math.random()*45)+1);
			}
			System.out.println(set);
			set.clear();
			}
	}
}
