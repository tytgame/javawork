package _03_repetitive;

public class T06_math_random {

	public static void main(String[] args) {
		// Math(수학에 관련된 클래스)
		// random : 실수형으로 출력(0 ~ 0.999999999999) double형으로 13자리까지 나옴
		double random1 = Math.random();
		System.out.println(random1);
		
		double random2 = Math.random() * 10; // 0 ~9.999999999999) 소수점 이하 13자리
		System.out.println(random2);
		
		// 0~9까지 정수만 출력 -> int형으로 강제 형변환
		int random3  = (int)(Math.random() * 10);
		System.out.println(random3);
		
		// 1~10까지 정수만 출력
		int random4  = (int)(Math.random() * 10) + 1;
		System.out.println(random4);
		
		// 0~4까지 정수만 출력
		int random5  = (int)(Math.random() * 5); 	// random에서 나올 수 있는 제일 큰 수는 0.99999999기 때문에
													// 여기에 5를 곱하면 최대 4.99999. ---> 0~4 출력
													// 0.9 * 5 = 4.5 --> 정수만 뽑으면 4
		System.out.println(random5);
		
		// 1~5까지 정수만 출력
		int random6 = (random5 +1);
		System.out.println(random6);
		
		

	}

}
