package _02_userException;

import java.util.Scanner;

public class Ex_main {

	public static void main(String[] args) {
		Ex ex = new Ex();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		
		int sum = 0;
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.print("두 수의 합은 : " + ex.add(num1, num2));
		} catch (Ex e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
}
