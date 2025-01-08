package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		// 접근가능
		ac.num = 10;
		System.out.println(ac.num);
		
		
//		ac.name = "유예성";
		System.out.println(ac.PI);		
//		ac.PI = 8.4324; 	오류나는 이유 -> 상수라서 값 변경 안됨
		
		// ac.name = "유예성"; 	--> private라서 접근불가
//		System.out.println(ac.name); 	--> private라서 접근불가
		ac.setName("유예성");
		String name = ac.getName();
		System.out.println(name);		// 유예성
		System.out.println(ac.getName());		// 유예성
		
	}

}
