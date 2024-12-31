package _01_operation;

import java.util.Scanner;

public class chap03_Ex2 {

	public static void main(String[] args) {
		
		
		/*	1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
			2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
			3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
			4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
			   사용자로부터 인원수와 사탕의 갯수를 입력받아
			   1인당 동일하게 나눠가진 사탕 개수와
			   나눠주고 남은 사탕 갯수를 출력하기
			5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
					이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
					
					ex.
					이름 : 이준기
					학년(숫자만) : 2
					반(숫자만) : 7
					번호(숫자만) : 3
					성별(M/F) : M
					성적(소수점 둘째 짜리까지) : 97.35
					
					2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
		
			6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
			    14세~19세 이하이면 청소년
			    20세 이상이면 성인으로 출력하시오
		
			7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
			   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
			8. 주민번호를 입력받아 남자인지 여자인지 출력하기
					
					ex.
					주민번호를 입력하세요(- 포함) : 123456-3123456
		
			9.  사용자로부터 두 개를 입력 받고(num1, num2에 저장)
			    또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
			    아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
			    
			    
			10. 사용자로부터 3개의 수를 키보드로 입력 받아 
    			입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// 1
		System.out.println("정수를 입력하세요 : ");
		int number = scan.nextInt();
		String result = number > 0 ? "양수입니다" : "양수가 아닙니다";
		System.out.println(result);
		
		// 2
		System.out.println("정수를 입력하세요(양수 0 음수 판별) : ");
		int number2 = scan.nextInt();
		String result2 = number2 > 0 ? "양수입니다" :
						 number2 == 0 ? "0 입니다" : "음수입니다";
		System.out.println(result2);
		
		// 3
		System.out.println("정수를 입력하세요(짝수 홀수 판별) : ");
		int number3 = scan.nextInt();
		String result3 = (number3%2) == 0 ? "짝수입니다" : "홀수입니다";
		System.out.println(result3);
		
		// 4
		System.out.println("인원수를 입력하세요 : ");
		int count = scan.nextInt();
		System.out.println("사탕의 개수를 입력하세요 : ");
		int candy = scan.nextInt();
		
		int can_div_count = candy/count;
		int can_out_count = candy%count;
		
		System.out.println("1인당 나눠개진 사탕은 : " + can_div_count + " 개 입니다");
		System.out.println("나머지 사탕의 개수는 : " + can_out_count + " 개 입니다");
							 
		// 5
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.println("학년을 입력하세요(숫자만) : ");
		int grade = scan.nextInt();
		
		System.out.println("반을 입력하세요 : ");
		int whichClass = scan.nextInt(); // class 는 변수명으로 쓸 수 없다
		
		System.out.println("번호를 입력하세요 : ");
		int whatNumber = scan.nextInt();
		
		System.out.println("성별을 입력하세요(M/F) : ");
		String sex = scan.next();
//		char sex = scan.next().charAt(0);
		String result_sex = sex.equals("M") ? "남학생" : "여학생";
		
		System.out.println("성적을 입력하세요 : ");
		double score = scan.nextDouble(); 
		
//		String sex_re = sex == 'M' ? "남" : "여";
		System.out.println(grade + "학년 " + whichClass + "반 " + whatNumber + "번 " + name + " " + result_sex + "의 성적은 " + score + "이다.");
//		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.");
		
		// 6
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		String result_age = age >= 20 ? "성인" :
							age >= 14 ? "청소년" :
							age >= 1 ? "어린이" : "잘못된 값입니다";
							
//		String result_age = age <= 13 ? "어린이" : age>= 14 && age <= 19 ? : "청소년" : "성인";
//	                       	                      논리곱으로 해도 가능

		System.out.println(result_age);
		
		// 7

		System.out.println("국어, 영어, 수학 점수를 입력하세요(띄어쓰기) >>> ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
	
		double avg = (kor + eng + math)/3.0;
		
		String pass_fail = kor > 40 && eng > 40 && math > 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(pass_fail);
		
		// 8
		
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String citizen = scan.next();
		
//		char citizen_sex = scan.next().charAt(7);
		
		char citizen_sex = citizen.charAt(7); 
		String citizen_result = citizen_sex == '1' || citizen_sex == '3'  ? "남자" : "여자";
		System.out.println(citizen_result);
		
		// 9 
		System.out.println("정수 두 개를 입력하세요 (띄어쓰기) >>> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("또 다른 정수 하나를 입력하세요 >>> ");
		int num3 = scan.nextInt();
		
//		num1 과 num2 사이의 값이면 false 출력
//		그 밖의 값이면 true 출
		
		String result_num = num3 <= num1 || num3 > num2 ? "true" : "false";
//		boolean result_num = num3 <= num1 || num3 > num2;
		System.out.println(result_num);
		
		// 10
		System.out.println("숫자 세 개를 입력하세요 >>> ");
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		int num6 = scan.nextInt();

		String result_num2 = (num4 == num5) && (num5 == num6) ? "true" : "false";
//		boolean result_num2 = (num4 == num5) && (num5 == num6);
		System.out.println(result_num2);
		
	}

}
