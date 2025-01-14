package _01_langPackage;
class Equals {
	int value;
	Equals(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {	// 값이 같은가
		return value == ((Equals)obj).value;
	}
	
	
}


public class T01_equals {

	public static void main(String[] args) {
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		
		// Object클래스의 equals는 '주소가 같은가'의 결과가 나온다
		// Object클래스의 equals는 '==' 를 한 결과와 같다
		if (e1.equals(e2)) {
			System.out.println("e1과 e2는 같다");
		} else {
			System.out.println("다르다");
		} // Equals 클래스에서 equals()를 값을 비교하는것으로 오버라이딩하고 난 후엔 결과가 다르다
		
		// equals() 오버라이딩과 상관없이 주소가 같은가?
		if (e1==e2) {
			System.out.println("e1과 e2는 같다");
		} else {
			System.out.println("다르다");
		}
		String str = "홍길동";
		String str2 = "홍길동";
		if(str.equals(str2)) {
			System.out.println("같다");
		}
		
	}

}
