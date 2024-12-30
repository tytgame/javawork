package chap02_variable;

public class Fommat_07 {

	public static void main(String[] args) {
		String url = "www.google.com";
		// java에서 시수형은 double이 기형
		// 실수형 숫자를 그냥 쓰면 double형으로 인식
		float f1 = 0.10f;
		double d1 = 1525262.234567872727;
		System.out.printf("%d, %d, %d\n", 10, 5, 1);
		System.out.printf("%f\n", 1.23456789);
		System.out.printf("%f\n", f1); // 더블형 출력은 없음
		System.out.printf("%8f\n", d1);
		System.out.printf("%4.2f\n", d1); // 네 자리 중에서 소수점 두자리만 출력
		System.out.printf("%.2f\n", d1); // 위와 같은 표현 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 중요. 외우기 가장 많이씀
		System.out.println("--------------------------");
		
		System.out.printf("%s", url); // \n 과 %n은 똑같이 줄바꿈
		System.out.println("글씨");
		
		System.out.printf("%20s\n", url); // 오른쪽정렬 (20칸 공백)
		
		System.out.printf("%-20s", url); // 20칸 오른쪽 공백
		System.out.println("글씨");
		
		System.out.printf("%.8s\n", url); // 왼쪽에서 8글자만 출력
		System.out.println("--------------------------");

		int octNum = 010; 	// 십진수 : 8
		int hexNum = 0x10; 	// 십진수 : 16
		int binNum = 0b10; 	// 십진수 : 2
		
		System.out.printf("8진수=%o은 10진수=%d\n", octNum, octNum);
		System.out.printf("16진수=%x은 10진수=%d\n", hexNum, hexNum);
		System.out.printf("%X\n", 10); // 10진수 10을 16진수로 출력
		System.out.printf("%x\n", 10); 
		System.out.printf("2진수=%s는 10진수=%d\n", Integer.toBinaryString(binNum), binNum);
		                                              // "10"이 들어있음
		
		int num = 77;
		String a2 = Integer.toBinaryString(num); 	// 10진수 -> 2진수
		String a8 = Integer.toOctalString(num); 	// 10진수 -> 8진수
		String a16 = Integer.toHexString(num); 		// 10진수 -> 16진수
		
		System.out.println("10진수 77을 2진수로 변환 : " + a2);
		System.out.println("10진수 77을 8진수로 변환 : " + a8);
		System.out.println("10진수 77을 16진수로 변환 : " + a16);
	}

}
