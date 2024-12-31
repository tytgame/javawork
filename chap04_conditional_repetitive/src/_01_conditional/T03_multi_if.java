package _01_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		
		/*
		 if~else문을 여러번 사용
		 
		 if (조건식) {
		 	조건식이 참일 때 실행되는 구문
		 } else if (조건식1) {
		 	조건식1이 참일 때 실행되는 구문
		 } else if (조건식2) {
		 	조건식2가 참일 때 실행되는 구문
		 } else {
		 	조건식 2가 거짓일 때 실행되는 구문
		 } 
		 */
		Scanner scan = new Scanner(System.in); // ctrl + shift + o : import 단축키
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score > 100) {
			System.out.println("잘못 입력했습니다");
		} else if (score >= 90) {	// 100 ~ 90
			System.out.println("A학점");
		} else if (score >= 80) {	// 89 ~ 80
			System.out.println("B학점");
		} else if (score >= 70) {	// 79 ~ 70
			System.out.println("C학점");
		} else if (score >= 60) {	// 69 ~ 60
			System.out.println("D학점");
		} else if (score >= 0) {	// 59 ~ 0
			System.out.println("F학점");
		} else {
			System.out.println("잘못 입력했습니다");
		}
		
		System.out.println("----------------------------");
		/*	
			if (score > 100 || score < 0) {
				System.out.println("잘못 입력했습니다");
			} else 
			if (score >= 90 && score <= 100) {	// 90 ~ 100 사이의 숫자
				System.out.println("A학점");
			} else 
			if (score >= 80 && score <= 89) {	// 80 ~ 89 사이의 숫자
				System.out.println("B학점");
			} else 
			if (score >= 70 && score <= 79) {	// 70 ~ 79 사이의 숫자
				System.out.println("C학점");
			} else 
			if (score >= 60 && score <= 69) {	// 60 ~ 69 사이의 숫자
				System.out.println("D학점");
			} else {
				System.out.println("F학점");
			}
			
			*/
		
	}

}
