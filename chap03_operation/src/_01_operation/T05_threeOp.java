package _01_operation;

import java.util.Scanner;

public class T05_threeOp {
	public static void main(String[] args) {
		// 삼항연산자
		/*
		조건식 ? -> 조건이 참일때 실행 : 조건이 거짓일때 실행
		*/
		
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다"; 	// false
//		boolean result = num1 < num2 ? true : false;
		System.out.println(result);
		
		System.out.print("num2의 숫자는 num1의 숫자보다 ");
		char re1 = num1 < num2 ? '소' : '대'; 	// false
		System.out.println(re1);
		
		// num3의 값을 절대값으로 변경하기
		int num3 = -8;
		int re2 = num3 < 0 ? num3*(-1) : num3;
		System.out.println(re2);
		
		// 사용자로부터 정수를 입력받아
		// 80점 이상이면 합격 그렇지 않으면 불합격을 출력하기
		
		Scanner scan = new Scanner(System.in); // 외우기 단축키 : ctrl + shift + o
		
		
		// 점수 입력받기
		System.out.println("점수를 입력하세요 : ");
		int grade = scan.nextInt();

		// 합격 여부 출력
//		String re3 = grade >= 80 ? "합격" : "불합격";
//		System.out.println("시험에 " + re3 + " 했습니다");
		
		String re4 = 
				grade > 100 ? "잘못 입력했습니다" :
				grade >= 90 ? "A학점 입니다" : 
				grade >= 80 ? "B학점 입니다" : 
				grade >= 70 ? "C학점 입니다" : 
				grade >= 60 ? "D학점 입니다" : 
				grade >= 50 ? "F학점 입니다" : 
				grade >= 0 ? "불합격 입니다" : "잘못 입력했습니다";

		System.out.println("당신의 학점은 " + re4);

				
				
		
	}

}
