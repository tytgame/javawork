package First;

import java.util.Scanner;

public class T02_Ex02 {

	public static void main(String[] args) {
		
		
		/*
		1.  주사위의 숫자 맞추기 게임
		    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
		    사용자로 부터 숫자 입력받아서
		    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
		    못맞췄으면 계속 물어보기
		
		2. 구구단 옆으로 출력하기
		   ex)
		   2*1= 2   3*1= 3   4*1= 4   5*1= 5   6*1= 6   7*1= 7   8*1= 8    9*1= 9
		   2*2= 4   3*2= 6   4*2= 8   5*2=10  6*2=12   7*2=14   8*2=16   9*2=18 
		   ....
		   2*9=18   3*9=27  4*9=36   5*9=45  6*9=54   7*9=63   8*9=72   9*9=81  
		
		
		3. ~ 
		java책 p111 ~ 113까지 문제 풀기		
		
		
				*/
		
		
		// 1번
		
		
		int random = (int)(Math.random()*6 + 1);	// 1 ~ 6
//		
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.println("숫자를 입력하세요(1~6) : ");
			int number = sc.nextInt();
			if (number == random) {
				break;
			}
		}
		System.out.println("축하합니다. 맞췄습니다");
		
		System.out.println("---------------------------------");
		
		// 2번
		
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan + "*" + i +"= " + dan*i + "  ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		
		
		
		// java 책. 3번
		
		int sum = 0;
		
		for(int i=0;i<=100;i+=5) {
			sum += i;
		}
		
		System.out.println("5의 배수의 합계는 " + sum);
		System.out.println("--------------------------");

		
		
		// java 책. 4번
		
		int evenSum = 0;	// 짝수
		int oddSum = 0;		// 홀수
		
		for (int i=1; i<=100; i++) {
			if (i%2 == 0) {
				evenSum += i;
			} else if (i%2 == 1) {
				oddSum += i;
			}
		}
		
		System.out.println("짝수의 합계는 " +evenSum);
		System.out.println("홀수의 합계는 " +oddSum);
		System.out.println("--------------------------");

		
		
		
//		// java 책. 5번
//		
		for(int x=1; x<=6;x++) {
			for(int y=1; y<=6; y++) {
				if(x+y == 6) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		System.out.println("--------------------------");


		
//		// java 책. 6번
//		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		

//		// java 책. 7번
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		
		// java 책. 8번
		

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		
		// java 책. 9번
		
		int count = 0;
		
		while (true) {
			count++;
			int random2 = (int)(Math.random()*6 + 1);	// 1 ~ 6 주사위
			System.out.println("(" + random2 + ")");
			if ( random2 == 6) {
				break;
			}
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
		
		
		
		
//		
//		for(int i=1;i<=5;i++) {
//			System.out.println("*");
//			for(int j=1;j<=5;j++) {
//				System.out.println("*");
//				for(int k=1;k<=5;k++) {
//					System.out.print("*");
//				}
//			}
//		}
		
		
		
		// 실행결과
		/*	
			
			*		1 4
			**		2 3
			***		3 2
			****	4 1
			*****	5 0
			
			
			0000*0000	4 1 4
			000***000	3 3 3
			00*****00	2 5 2
			0*******0	1 7 1
			*********	0 9 0	
		
		
		
		
			*/
		
		
		
		// java 책. 9번
		// random : 1 ~ 6 주사위
		
//		while(true) {
//			
//			i++;
//			if ( random == 6) {
//				System.out.println("총 주사위 굴린 횟수는 : " + i + "회");
//				break;
//			}
//		}
//		
		
		
		
		
		/*	[실행 결과]
			
					(3)
					(6)
					총 주사위 굴린 횟수는 : 2회
			
			*/
	}

}
