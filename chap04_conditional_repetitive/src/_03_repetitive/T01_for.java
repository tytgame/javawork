package _03_repetitive;

public class T01_for {

	public static void main(String[] args) {
		/*
		 * 반복문 : 원하는 갯수 또는 조건이 맞을떄까지 반복하여 실행하고자 할 때
		   1. for : 원하는 갯수 만큼 반복실행
		   	  for(초기식; 조건식; 증감식) {
		   	  	실행문
		   	  }
		   2. while : 조건이 맞을 때까지 반복 실행
		   3. do~while
		 */
		
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("------------------------");
		
		for (int i=1; i <= 10; i++) {
			System.out.println("어서오세요");
		}
		System.out.println("------------------------");
		
		for (int i=1; i<=100;i++) {
			System.out.println(i + ". 축하합니다");
		}
		System.out.println("------------------------");

		for (int i=100; i>=1; i--) {
			System.out.println(i + ". 감소");
		}
		System.out.println("------------------------");
		
		for(int i=1; i<=100; i+=2) { 	// i = i + 2
			System.out.println(i + ". i값 출력");
		}
		System.out.println("------------------------");

		// 1~100 까지의 합계 구하기
		
		int sum = 0;
		for (int i =1; i<=100; i++) { // 홀수 --> i+=2 , 짝수 --> i=0; i+=2 
			
//			int sum = 0;		안에다 넣으면 계속 0 으로 다시 만들게 됨.
			sum += i;		// sum = sum + i;
//			System.out.println("1~10 의 합계 : " + sum);
		}
		
		System.out.println("1~100 의 합계 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
