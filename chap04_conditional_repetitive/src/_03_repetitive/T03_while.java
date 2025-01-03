package _03_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*
		 while (조건식) {
		  		조건식이 참인동안 계속 실행
		 }
		 
		   반복문에서 같이 사용
		 - break : 반복문을 빠져 나올 때
		 - continue : continue뒤의 구문은 실행하지 않고 다시 반복문 실행
		 
		 
		 
		 
		// for문을 while으로
		// 출력 1 2 3 4 5
		
		
		for (int i =1;i<=5;i++) {
			System.out.println(i);
		}
		*/
		
		int i = 1; 		// 초기식
		while (i<=5) { 		// 조건식
			System.out.println(i);
			i++; 		// 증감식
		}
		System.out.println("----------");
		
		// while 문으로 1~10 까지의 합계
		
		int num = 1;
		int sum = 0;
		while (num<=10) {
			sum += num++;    // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 == 55
//			sum += ++num;  --> 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 == 65
		}
		System.out.println("1부터 10까지의 합계 : " + sum);
		
		// break
		int count = 0;
		while (true) {
			System.out.println(++count);
			if(count == 5) { 	
				break;		// 이게 없으면 무한루프, 반복문을 빠져나옴
			}
		}
		System.out.println("----------");
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("문자1개(멈추려면 'q') 입력 :");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q') {
				break;		// 반복문을 끝낸다, 멈추는 조건 반드시 들어가야함
			}
			System.out.println(ch);
		}
		
		System.out.println("프로그램 종료");
		
		
		sum = 0;
		for(int j=1; j<=10; j++) {
			sum += j;		// j == 4
			
			if(sum >= 10) { // 1 + 2 + 3 + 4 == 10
				break;		// 멈추는 조건 반드시 필요는 X
			}
		}
		System.out.println("4 까지의 합 : " + sum);	// sum == 10
		System.out.println("============================");

		// continue
		// 1~100까지의 합계 중 3의 배수를 제외한 합계 구하기
		// 1 + 2 + 4 + 5 + 7 + 8 + 10 + 11 + 13 + .....
		
		sum = 0;
		for(int j=1; j<=100; j++) {
			if (j%3 == 0) {
				continue;		// '~~ 를 제외한' 정도의 뜻으로 해석하면 쉬움
								// continue 아래의 명령문을 실행하지 않음
			}		// break : ~~ 할때 멈춰라
			
			sum += j;		// 1 + 2 + 4 + .... + 98 + 100
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계 : " + sum);
		
		
		
		
		/*
		// 보통 이렇게 많이 씀
		while (true) {
			if() {
				break;	// 반복문을 빠져나옴
			}
		}
		*/
		
		
		/*
		sum = 0;
		for(int j=1;j<=10;j++) {
			sum += j;
		}
		System.out.println(sum);
		
		*/
	}

}
