package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		System.out.println("문자열");
		System.out.println(5+8);
		
		// 변수 : 저장공간
		/*		
		 int : 정수를 저장하는 공간(4byte(32bit))
		 double : 실수를 저장하는 공간(8byte)
		 char : 문자 1개(2byte, 유니코드)
		 String : 문자열
		*/
		
		// 컴퓨터 언어는 2진수로 되어 있음 (0,1)
		// 1bit : 1개(0 or 1)
		// 1byte : 8bit
		
		/*
		자료형 변수명;
		변수명 = 값;
		*/
		
		int number;
		number = 3; 		// 오른쪽에 있는 값을 왼쪽에 대입
		
		System.out.println(number); // 3
		
		// 기존의 저장공간에 덮어쓰기
		number = 4;
		
		System.out.println(number); // 4
		
		// 새로운 저장공간 만들기
		int number2 = 5;
		System.out.println(number); // 4
		System.out.println(number2); // 5
		
		// 덮어쓰기
		number2 = 8;
		
		int sum = number+number2; // 12
		System.out.println(number + "+" + number2 + "=" + (number+number2));
		System.out.println(number + "+" + number2 + "=" + sum);

		// 똑같은 변수 두번 만들기 불가능
		// 새로운 변수 만들ㄹ기(기존에 있던 저장공간과 동일이름 안됨)
		// int number2 = 10;
		
		// <과제>
		// -----------------------------------
		// 1. int  저장공간을 2개 만들기
		// 2. 각각 5와 3을 넣기
		// 3. 저장공간의 각 값들을 사칙연산하여 출력하기
		// -----------------------------------
		
		int a = 5;
		int b = 3;
		// a * b 
		System.out.println((a*b)); // 15
		
	}

}
