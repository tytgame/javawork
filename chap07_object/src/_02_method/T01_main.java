package _02_method;

public class T01_main {

	public static void main(String[] args) {
		T01_api_method m1 = new T01_api_method();
		m1.print1();
		
		m1.print2();	// 출력 안됨
		System.out.println(m1.print2());	// 출력 됨
		int result = m1.print2();
		System.out.println(result);		// 10
		
		System.out.println(m1.print3()); // 반환되는 문자
		
		System.out.println(m1.print4()); // true
		
		m1.print5(10); 	// 10, 매개변수에 반드시 값을 넣어야 함
		
		int sum = m1.print6(3, 10);	// sum = 13
		System.out.println(sum);
		
		System.out.println(m1.print6(10, 100));	 // 110
		
		m1.print7("더조은", 100);

		System.out.println("-------------------------");
		
		T01_api_op m2 = new T01_api_op();

		System.out.println(m2.add(5, 7));
		
		int result1 = m2.add(10, 5);
		System.out.println(result1);
		
		int result2 = m2.sub(10, 5);
		System.out.println(result2);
		
		int result3 = m2.multi(10, 5);
		System.out.println(result3);
		
		int result4 = m2.remain(10, 5);
		System.out.println(result4);
		
		double result5 = m2.div(10, 3);
		System.out.println(result5);
		System.out.printf("%.2f", m2.div(10, 3));
		
	}
}
