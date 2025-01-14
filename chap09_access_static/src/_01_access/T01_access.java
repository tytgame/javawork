package _01_access;

public class T01_access {
	int num = 5;	// 아무것도 안붙으면 default, 같은 패키지 안에서 접근 가능
	private String name = "홍길동";	 // 이 클래스 에서만 접근가능 다른 클래스에서 접근 불가 
	final double PI = 3.14;		// 상수, 상수는 일반적으로 대문자로 씀
	
	/*
	  setter, getter 메소드
	  : 변수 앞에 private에 접근 할 수 있도록 메소드 정의
	  - setter 메소드 : private가 붙은 변수에 값을 넣을 때 사용함
	   반환형 set변수명(자료형 변수명) {  						--> 변수명 첫 글자는 대문자로
	   		this.변수명 = 변수명;
	   }
	  - getter 메소드 : private 변수의 값을 리턴
	  반환형 get변수명() {
	  	 return 변수명;
	  }
	  
	 */
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	/*
	 * final : 마지막
	 
	   final 변수 -> 상수라는 뜻, 값 변경 X
	   final 메서드 -> 오버라이딩이 불가라는 뜻
	   final 클래스 -> 상속 불가라는 뜻

	 */




}
