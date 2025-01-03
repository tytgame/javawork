package _03_repetitive;

import java.util.Scanner;

public class T02_Ex02_answer {

	public static void main(String[] args) {
		// T02_Ex02 문제 풀이
		
		// 1번
		
		Scanner sc = new Scanner(System.in);
		// 1 ~ 6 정수
//		int ran1 = (int)(Math.random()*6) + 1;
//		int user;
//		
//		do {
//			System.out.println("주사위의 숫자를 맞춰보세요 : ");
//			user = sc.nextInt();
//			
//			if (ran1 == user) {
//				System.out.println("축하합니다. 맞췄습니다");
//			} else {
//				System.out.println("틀렸습니다. 다시 입력하세요");
//			}
//		} while (ran1 != user);
//		System.out.println("--------------------------");
//		
		// 2번

		System.out.println("구구단 출력");
		
		for(int i =1; i<=9; i++) {
			for(int dan= 2;dan<=9;dan++) {
				System.out.printf("%d*%d=%2d\t", dan,i,dan*i); // %2d -> 두자리 맞춰서 출력
			}
			System.out.println(); // 안쪽 for문이 끝나면 엔터
		}
		System.out.println("--------------------------");

		// 3번. 1 ~ 100 5의 배수 합계
		
		int sum = 0;
		for (int i=1;i<=100;i++) {
			if(i%5 == 0)
				sum += i;
		}
		System.out.println("1 ~ 100 까지 5의 배수의 합계 = " + sum);
		
		// 다른 풀이
		sum = 0;
		for (int i=5;i<=100;i+=5) {
			sum += i;
		}
		System.out.println("1 ~ 100 까지 5의 배수의 합계 = " + sum);
		System.out.println("--------------------------");

		// 4번
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1;i<=100;i++) {
			if (i%2 == 0) {		// 짝수일 때
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계 : " + evenSum);
		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("--------------------------");

		// p112 3번
		for (int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if (i+j == 6) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		System.out.println("--------------------------");

		// p112 4번
		
										//int z = 0; 헷갈리면 변수를 밖에 두고해도 가능
		for(int i=1;i<=5;i++) {
			for (int j=0; j<i; j++) {	// j<z
				System.out.print("*");
			}
										// z++;
			System.out.println();
		}
		System.out.println("--------------------------");

		// 5번
		
		for(int i=5; i>=-1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");

		// 6번
		
		/*
		 * 
		     *		4 1
		    *** 	3 3
		   ***** 	2 5
		  ******* 	1 7
		 *********  0 9
		 */


		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int z=1; z<=i*2+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		// 어려우면 변수를 따로 두기
//		
//		int a = 1;
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print("");
//			}
//			for(int z=1;z<)
//		}
		System.out.println("--------------------------");
		
		// 7번
		   
		int count = 1;
		while (true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("추출한 숫자 : " + num);
			if (num == 6) {
				break;
			}
			count++;
		}
		System.out.println("주사위가 6이나올때까지 총 횟수 : " + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
