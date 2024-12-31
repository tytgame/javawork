package chap02_casting02;

public class Promotion_01 {

	public static void main(String[] args) {
		// 자동 형변환 : 작은 자료형을 큰 자료형에 넣을 때
		byte b1 = 20; // byte = 1byte
		short s1 = b1; // short = 2byte
		int int1 = b1; // int = 4byte
		int1 = s1; // 4byte에 2byte 대입
//  	 4     2
		
		char ch1 = '유'; // char = 2byte
//		System.out.println((int)ch1);  << 이렇게 해도 유니코드 나옴
		int int2 = ch1;
		System.out.println("'유'의 유니코드 : " + int2);
		System.out.println(ch1);
		
		double d1 = int1;
		System.out.println(d1);
		
		d1 = s1+1;
//double(8byte) = short(2byte) + int(4byte)	
		System.out.println(d1);
		
		
	}

}
