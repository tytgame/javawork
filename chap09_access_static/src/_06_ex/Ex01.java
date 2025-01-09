package _06_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 1.
		// 3번
		
		// 2.
		// 4번
		
		// 3. Person 클래스에 작성
		
		// 4.
		// 1번
		
		// 5.
		// 4번
		
		// 6.
		// 메서드 오버로딩이란 어떤 클래스가 자료형 혹은 매개변수가 다른 어떤
		// 기능을 각각 다른 메서드에서 추가하는 것이다.
		
		// 7.
		// getAverage 메서드
		
		// 8.
		// 출력값 : 123456
		

			
		// 9.
		
			Excercise ex1 = Excercise.getInstance();
			Excercise ex2 = Excercise.getInstance();
			
			System.out.println("ex1 == ex2 : " + (ex1 == ex2));
			
		// 10.
		// 클래스 내부에서 자신의 주소를 참조하는 예약어는 " this " 이다.	
		
		// 11. 
		int[] arr = {9,5,24,13,3,21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		// 12.
		// 1번

			} // main
		} // class Ex01

// 9번 문제
class Excercise {
	static Excercise singleton = new Excercise();
	
	
	private Excercise() {
		System.out.println("Excercise 싱글톤");
	}
	
	public static Excercise getInstance() {
		return singleton;
	}
	
}

// 11번 문제
class Math {
	int max(int[] intArr) {
		
//		int min = intArr[0];
		int max = intArr[0];
		
		for(int i=1; i<intArr.length; i++) {
			if (max < intArr[i]) {
				max = intArr[i];
			}
//			if (min > intArr[i]) {
//				min = intArr[i];
//			}
		}
		return max;
	}
	
	int min(int[] intArr) {		
		int min = intArr[0];
//		int max = num[0];
		
		for(int i=1; i<intArr.length; i++) {
//			if (max < num[i]) {
//				max = num[i];
//			}
			if (min > intArr[i]) {
				min = intArr[i];
			}
		}
		return min;
	}
	
	
	
}


