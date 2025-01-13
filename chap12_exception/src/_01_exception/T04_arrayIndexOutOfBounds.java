package _01_exception;
// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어났을 때

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		/*
		int[] num = {1,2,3,4,5};
		num[5] = 10;
		System.out.println(num[5]);
		 */
		try {
			int[] num = {1,2,3,4,5};
			num[5] = 10;
//			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 번호는 0~4까지만 사용 가능");
			System.out.println(e);
			
		}
	}

}
