package _04_arrayFor;

import java.util.Arrays;

public class T01_arrayFor {

	public static void main(String[] args) {
		// 향상된 for문 : 배열에서만 사용
		// 배열의 처음부터 끝까지 순환할 때 사용
		
		int num[] = {1,2,3,4,5};
		
		for(int result : num) {			// int면 for int로
			System.out.println(result);
		}
		
		
		
		String str[] = {"가나다", "ABC", "123"};
		for(String result : str) {		// String 이면 for String으로
			System.out.println(result);
		}
		
		String newStr[] = new String[3];
		int index = 0;
//		for(int i=0;i<newStr.length;i++) {
//			newStr[i] = str[i];
//		}
		
		for(String result : str) {
			newStr[index++] = result;
			System.out.println(newStr[index-1]);
		}
		
//		System.out.println(Arrays.toString(newStr));
		
		
		
	}

}
