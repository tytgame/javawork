package _05_constructor;

class ConOver2 {
	int num;	// 인스턴스 변수
	double dou;
	String name;
	
	// 다른 생성자 호출
	ConOver2() {
		this(1, 1.0, "홍길동");	// this()는 무조건 첫째줄에 넣어야함
	}
	
	ConOver2(int num) {
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	
	// 생성자에서 다른 생성자를 호출할 수 있다
	ConOver2(int num, double dou) {
		// 다른 생성자를 호출할 때는 첫번째에 넣어야 됨
		this(num, dou, "홍길동");
		System.out.println("매개변수가 2개인 생성자");		
	}
	
	
	ConOver2(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	// 가변인자 : 들어올 인자(매개변수에 넣어줄 값)의 갯수를 모를 때
	// (int... num) : 인자가 0개 이상
	// 반드시 들어와야할 인자가 있다면 먼저 선언하고 가변인자는 맨 마지막에 넣는다
	
	void method(int... num) {
		System.out.println("인자가 0개 이상");
		for(int result : num) {
			System.out.println(result);
		}
		System.out.println("-----------------------");
	}
	
	
	
	void method2(int num, int... num2) {
		System.out.println("인자가 1개 이상");
		System.out.println("첫번째 값 : " + num);
		for(int result : num2) {
			System.out.println(result);
		}
		System.out.println("-----------------------");
	}
	
	
	void method3(String name, String... str) {
		for(String result : str) {
			System.out.println(result + name);
		}
		System.out.println("------------------------");
	}
	
}


public class ConOver2_main {

	public static void main(String[] args) {
		ConOver2 con = new ConOver2(5); // ConOver2(int num)이 (3개있는) ConOver 먼저
										// 호출해서 "3개" -> "1개" 이런순서로 나옴
		System.out.println(con.num);
		System.out.println(con.dou);
		System.out.println(con.name);
		con.method();		// 0개 이상. 비워놔도 됨
		con.method(1,2,3,4);
		
		con.method2(1, 2, 3,4,5,6,7);		// 1개 이상 넣어야함
				
		con.method3("/", "홍길동", "강감찬", "이순신");
		
		String[] names = {"홍길동", "강감찬", "이순신"};
		
		con.method3("/", names);
	}

}



