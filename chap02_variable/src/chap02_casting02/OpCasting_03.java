package chap02_casting02;

import java.util.Scanner;

public class OpCasting_03 {

	public static void main(String[] args) {
		// int 보다 작은 자료형은 연산시 무조건 int형
		byte b1 = 10;
		short s1 = 5;
		
		byte result = (byte) (b1 + s1);
//		              byte형 <<< int형
		
		// 리터럴 값. 리터럴일때는 연산이 아니라 다음 글자를 의미
		char c1 ='A'+1;
		System.out.println(c1);
//		
//		int ch = c1+1;
////		         int형
//		char ch2 = (char)(c1+1);
////		                  int형
//		System.out.println(ch);
//		System.out.println(ch2);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;
		System.out.println(result3); // 33
		
		double result4 = (num1/num2);
//		                   int  33
		System.out.println(result4); // 33.0
//		
//		(double) num1 / num2; // double형
		
		double result5 = (double)num1 / (double)num2;
		System.out.println(result5);
		
		System.out.println("--------------------------");
		
		
	/*	   1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
		
		   3.1  iNum1 / iNum2의 몫 출력
		   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
		   3.3  iNum1의 값이 10.0으로 출력되게 하기
		   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
		   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
		   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
		   3.7  ch변수의 유니코드 출력하기
		   3.8  ch변수에 1을 더해 L 이 출력되게 하시오
		   
    */
		
		// 1
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char initial = scan.next().charAt(0);
		System.out.println("문자의 유니코드는 : " + (int)initial);

//		char char1 = '^';
//		int c = (int) char1;
//		System.out.println("1 : " + c);

		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'K'; 
		

		// 3.1
		System.out.println("3.1 : " + iNum1/iNum2);
		
		// 3.2
		double result_d = iNum2*dNum;
		System.out.println("3.2 : " + result_d);
		
		// 3.3
		System.out.println("3.3 : " + (double)iNum1);
		
		// 3.4
		System.out.println("3.4 : " + (float)iNum1/iNum2);
		
		// 3.5
		System.out.println("3.5 : " + iNum1/(int)fNum);
		
		// 3.6
		System.out.print("3.6 : ");
		System.out.printf("%.12f\n", (float)iNum1/fNum);
		
		// 3.7
		System.out.println("3.7 : " + (int)ch);
		
		// 3.8
		ch = (char) (ch+1);
		System.out.println("3.8 : " + ch);
	
	}

}
