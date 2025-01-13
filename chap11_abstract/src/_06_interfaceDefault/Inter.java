package _06_interfaceDefault;
/*
  default 메소드 : 구현부가 있다
   - 오버라이딩이 필요하면 해도 되고, 안해도 됨
   static 메소드 : 구현부가 있다
   - 오버리이딩을 할 수 없다
 */

interface Inter1 {
	int method1();
	static String stMe() {
		return "static 메소드";
	}
}
interface Inter2 {
	int method2();
	default String me2() {
		return "default 메소드2";
	}
}
public interface Inter extends Inter1, Inter2{
	int method();
	default public String me() {	// public 생략 가능
		return "default 메소드";
	}
}
