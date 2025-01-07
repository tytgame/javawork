package _05_constructor;

class ConOver {
	int num;	// 인스턴스 변수
	double dou;
	String name;
	
	ConOver() {
		num = 1;
		dou = 1.0;
		name = "홍길동";
	}
	
	ConOver(int num) {	// 지역변수
		this.num = num; 	// this : 나 자신의 객체
		dou = 1.0;
		name = "홍길동";
	}
	
	/*
	ConOver(int num, double dou) {
		this.num = num;
		this.dou = dou;
		name = "홍길동";
	}
	*/
	
	// 생성자에서 다른 생성자를 호출할 수 있다
	ConOver(int num, double dou) {
		// 다른 생성자를 호출할 때는 첫번째에 넣어야 됨
		this(num, dou, "홍길동");
		this.num = num;
		this.dou = dou;
		name = "홍길동";
	}
	
	
	ConOver(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
	}
	
	
	
}


public class ConOver_main {

	public static void main(String[] args) {
		ConOver co1 = new ConOver();
		System.out.println(co1.num);
		System.out.println(co1.dou);
		System.out.println(co1.name);
		
	}

}



