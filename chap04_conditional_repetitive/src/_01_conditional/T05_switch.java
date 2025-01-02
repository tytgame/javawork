package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch ~ case
		/*
		 * 
		 범위를 지정하기는 어려움 ---> If문
		 
		 정해진 값 --> switch
		 
		 switch로 범위를 쓸 때는 case를 몫으로 지정해도 됨
		 ex) 90 91 92 ... 99 / 10 = 9   <--- case 9
		 	 80 81 82 ... 89 / 10 = 8   <--- case 8
		 	 .
		 	 .
		 	 .
		 	 .
		 	 .
		 	 
		 
		 switch (변수) {
		 	case 1 : 
		 		변수에 들어있는 값이 1일때 실행;
		 		break;
		 	case 2 :
		 		변수에 들어있는 값이 2일때 실행;
		 		break;
			default :
				변수에 들어있는 값이 1,2를 제외한 나머지 숫자일 때 실행;
		 }
		 */
		
		int num = 2;
		
		switch (num) {
			case 1:
				System.out.println("1 입니다");
				break;
			case 2:
				System.out.println("2 입니다");
				break;
			case 3:
				System.out.println("3 입니다");
				break;
			default:
				System.out.println("1,2,3을 제외한 다른 숫자");
		}
		System.out.println("-------------------------------");
		
		char ch = 'k';
		switch (ch) {
			case 'k':
				System.out.println("김씨입니다");
				break;
			case 'l':
				System.out.println("이씨입니다");
				break;
			case 'p':
				System.out.println("박씨입니다");
				break;
			default:
				System.out.println("성이 김,이,박씨가 아닙니다");				
		}
		System.out.println("-------------------------------"); 		// break가 없으면 해당 변수 아래의 케이스는 모두 실행됨
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------"); 
//		System.out.println("태어난 달을 입력하세요 : ");
//		int month = sc.nextInt();
//		
//		switch (month) {
//			case 1:
//			case 2:
//			case 12:
//				System.out.println("겨울에 태어났군요"); 	// month가 1, 2, 12 일 때 실행
//				break;
//			case 3: case 4: case 5:
//				System.out.println("봄에 태어났군요");
//				break;
//			case 6:
//			case 7:
//			case 8:
//				System.out.println("여름에 태어났군요");
//				break;
//			case 9:
//			case 10:
//			case 11: // default로 해도 됨. 단, 9, 10, 11만 남는게 확실할 떄
//				System.out.println("가을에 태어났군요");
//			default:		//default를 반드시 넣어야 하는건 아님
//				System.out.println("잘못 입력");
//		}
//		
		System.out.println("-------------------------------"); 

		
		// 문제) 연산할 두 숫자와 연산자 ( +, -, *, /, %) 를 입력받아
		// 연산한 결과 출력
		
		System.out.println("두 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요 (+, -, *, /, %) : ");
		String cal = sc.next();
//		char cal = sc.next().charAt(0);
		
		
		char cal_ch = cal.charAt(0);
		
		// 연산한 결과
		switch (cal_ch) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println((double)num1/num2);
			System.out.printf("%d/%d=%.2f", num1, num2, (double)num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
}
