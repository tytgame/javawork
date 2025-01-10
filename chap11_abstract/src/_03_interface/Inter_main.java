package _03_interface;

public class Inter_main {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		ic.print(5);
		ic.inMethod();
		System.out.println(ic.PI);
		
//		ic.PI = 23.3;			
//		ic.MAX = 10;   				--> 상수라서 변경 못함
		
//		Inter in = new Inter(); 	--> 인터페이스는 객체를 생성할 수 없다
		
		
	}

}
