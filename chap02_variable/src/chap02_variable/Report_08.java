package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로 부터 국어, 수학, 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점2째자리까지(반올림)) 출력
		
		Scanner scan = new Scanner(System.in); // import 해주는거 잊지않기
		
		// 국어 숳ㄱ 컴퓨터 점수 입ㄹㄹ력ㄷ기
		System.out.println("국 수 컴 점수 3개 입력(띄어쓰기)");
		float korean = scan.nextFloat();
		float math = scan.nextFloat();
		float computer = scan.nextFloat();
		
		// 총점 출력
		float sum = ( korean + math + computer);
		System.out.println("총점 : " + sum);
		
		// 평균 출력
		System.out.print("평균 : ");
		System.out.printf("%.2f\n", (korean + math + computer)/3);
		
		//
		System.out.println("----------------------");
		
		
		
		
		/*System.out.print("점수 입력(국어,수학,컴퓨터점수를 띄어쓰기로 넣기) >> ");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int com = sc.nextInt();*/
		
		System.out.print("국어점수 입력 >> ");
		int kor = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		int math2 = scan.nextInt();
		System.out.print("컴퓨터점수 입력 >> ");
		int com = scan.nextInt();
		
		//총점
		int sum2 = kor + math2 + com;
		double avg = sum / 3.0; // 3 대신 3.0
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		
	}

}
