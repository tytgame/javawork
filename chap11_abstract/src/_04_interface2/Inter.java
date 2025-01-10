package _04_interface2;

public interface Inter {
	// 상수만 사용가능
	public static final double PI = 3.14;
	int MAX = 100;	// final 안 써도 컴파일 할 때 자동으로 상수화가 됨
					// 컴파일시 public static final이 자동으로 붙음
	
	// 추상메서드만 사용가능
	public abstract void print(int a);
	public abstract void inMethod();
	String inStr(String name);	// 컴파일 하면 public abstract가 자동으로 붙음
	
	
	
	
	
	
	
	
	
	
}
