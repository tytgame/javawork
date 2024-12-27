package chap02_variable;

public class Char_05 {

	public static void main(String[] args) {
		// 리터럴 : 저장공간을 만들면서 바로 값을 넣는것
		char ch = '0';
		System.out.println(ch); // 0
		System.out.println((int)ch); // 48
		
		char ch2 = 'a' + 1; // 유니코드 97+1 = 98 -> 유니코드는 'b'
		System.out.println(ch2); // b
		
		char ch3 = 'A';
		// char result = ch3 + 1; (x)
		int result = ch3 + 1; // 리터럴값이 아닌 나중에 더하면 오류가 남 ( char로 하면 오류가 남)
				// int = char + int
		// 형변환시 int이하는 연산을 하면 모두 int형으로 형변환이 됨
		
		System.out.println(result); // 66
		
	}

}
