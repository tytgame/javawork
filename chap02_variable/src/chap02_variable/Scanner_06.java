package chap02_variable;

import java.util.Scanner; // Scanner 자리에 .* 사용가능

public class Scanner_06 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in); // 외우기
	
	/*
	// 사용자에게 무엇을 해야되는지 써주는것이 좋다
	System.out.print("정수 입력 : ");
	// 정수형으로 받을때 nextInt() 
	int num1 = scan.nextInt();
	System.out.println("입력받은 값 : " + num1);
	
	
	System.out.print("이름 입력 : ");
	// 문자열로 받을 때 next()
	String name = scan.next(); // 1개의 문자열 : 스페이스바가 없는곳까지
	System.out.println("이름 : " + name);
	
	
	System.out.print("당신은 학생 입니까? : ");
	// 논리형으로 받을 때 nextBoolean()
	boolean student = scan.nextBoolean();
	System.out.println("당신의 답은 : " + student);
	
	
	// 실수형으로 받을 때 nextDouble()
	// 문자열의 한 문장을 얻어올 때 nextLine() : enter를 칠 때까지
	scan.nextLine(); 	// 24줄의 enter가 들어옴 nextLine()을 중간에 사용할 때는 한번 더 써줘서 앞의 enter를 넣어줌
						// 혹은 맨 첫줄에 넣을때는 상관없음
	
	System.out.print("주소 입력 : ");
	String address = scan.nextLine();
	System.out.println("주소는 : " + address);
	
	
	
	System.out.print("성의 이니셜 1글자 입력 : ");
	char initial = scan.next().charAt(0);
			    // 문자열 : 1글자 이상
				// abcde : CharAt(0) = a CharAt(1) = b ...
	System.out.println("성의 이니셜은 : " + initial);
	
	*/
	
	System.out.println("정수 3개 입력(띄어쓰기로) >> ");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int num3 = scan.nextInt();
	System.out.println("첫번째 숫자 : " + num1); // 단축키 : sysout 치고 컨트롤 + 스페이스바
	System.out.println("두번째 숫자 : " + num2);
	System.out.println("세번째 숫자 : " + num3);
	
	// --------------------------------------------------------------------------
	// 레포트
	/*
	 * 1. 사용자로 부터 두 수를 입력받아
	 *    사칙연산을 출력하시오.
	 * 2. 사용자로 부터 연산자(1글자)를 입력받아
	 *    위 1번의 두 수를 연산하여 출력하시오.
	 *    
	 *    입력받음 : 7 5
	 *    7+5=12
	 *    7-5=2
	 *    7*5=35
	 *    7/5=1
	 *    
	 *    입력받음 : *
	 *    7*5=35
	 *    
	 *    
	 */
	
	// 두 수 입력받기
	System.out.println("계산할 두개의 수를 입력하시오(띄어쓰기로) >> ");
	int int1 = scan.nextInt();
	int int2 = scan.nextInt();
	System.out.println("입력받은 값 : " + int1 + " , " + int2); // 입력받은 수 출력
	
	// 두 수의 연산자 입력받기
	System.out.println("계산할 연산자를 입력하시오( + , - , * , / ) >>");
	char cal = scan.next().charAt(0);
	
	// 결과값 변수 생성
	int result = 0;
	
	// 연산한 값 출력
	switch (cal) {
		case '+':
			result = (int1 + int2);
			System.out.println("연산값은 >> " + int1 + " " + cal + " " + int2 + " = " + result);
			break;
		case '-':
			result = (int1 - int2);
			System.out.println("연산값은 >> " + int1 + " " + cal + " " + int2 + " = " + result);
			break;
		case '*':
			result = (int1 * int2);
			System.out.println("연산값은 >> " + int1 + " " + cal + " " + int2 + " = " + result);
			break;
		case '/':
			result = (int1 / int2);
			System.out.println("연산값은 >> " + int1 + " " + cal + " " + int2 + " = " + result);
			break;
		default:
			System.out.println("유효한 연산자를 입력하세요 ( + , - , * , / )");
	}
	
	
	
	}


}