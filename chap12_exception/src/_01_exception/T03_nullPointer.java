package _01_exception;
// NullPointerException : 객체가 들어가야 되는 자리에 null이 있을 때

public class T03_nullPointer {

	public static void main(String[] args) {
		/*
		String data = null;
		System.out.println(data.toString());
	*/
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println("객체가 없습니다.");
			//System.out.println("메시지 : " + e);
		}
		System.out.println("123");
	}
}