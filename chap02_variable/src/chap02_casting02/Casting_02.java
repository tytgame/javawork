package chap02_casting02;

public class Casting_02 {

	public static void main(String[] args) {
		int num1 = 1234567;
		byte b1 = (byte)num1; // (byte) << 강제 형변환
		System.out.println(b1); // -121
		
		// java에서 정수의 기본자료형 int
		long long1 = 1111111113456722222L; // 8byte
					// 숫자 뒤에 L 안붙이면 int형으로 인식함, L 붙이면 long형
		float float1 = 5.345F; // float도 마찬가지로 뒤에 F 안붙이면 int형으로 인식해서 오류남
							   // 혹은 앞에 (float) 붙여줘야 함
		float flo2 = long1;
		
		// char 65535까지 저장
		int num2 = 50896;
		char ch1 = (char)num2; // 자동 형변환이 안되니 (char)로 강제 형변환
		System.out.println(ch1);
		
		// int 이하의 타입끼리 연산하면 모두 int형으로 형변환이 됨
		
		//		char ch = 'A';
		//		char b = (ch+1); >>>>> 오류
		//	    char ch = 'A'+1; >>>>> 오류 안남
		
		// double + (아무 형) = double 형이 됨
		
		
		
	}

}
