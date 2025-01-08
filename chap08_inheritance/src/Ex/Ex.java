package Ex;

public class Ex {
	
	// 1 ~ 10 출력하는 메소드
	void one_to_ten() {
		for(int i=1;i<11;i++) {
			System.out.print(i+" ");
		}
	}
	
	// 1 ~ 10 합 메소드
	int sum() {
		int sum1 = 0;
		for(int i=1;i<11;i++) {
			sum1 += i;
		}
//		System.out.println(sum);
		return sum1;
	}
	
	// 1 ~ n 합 메소드
	int sum_num(int x) {
		int sum1 = 0;
		for(int i=0;i<=x;i++) {
			sum1 += i;
		}
		return sum1;
	}
	
	// 두 정수의 나눗셈 결과 메소드
	int result_div(int x, int y) {
		int result = x / y;
		return result;
	}
	
//	// 문자의 소문자를 대문자로 바꾸는 메소드
//	String changer(String word) {
//		글자 word를 입력받고
//		for문으로 한글자씩 분리하기
//		for(int i=0;i<word.length();i++) {
//			
//		}
		
		
	}

//}
