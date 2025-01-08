package _04_document;

public class Document {
	String name;	// 인스턴스 변수
	static int count;	// 정적 변수 ( 클래스 변수 )

	Document() {
		System.out.println("제목없음" + ++count + ".txt 문서가 생성됨");
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + ".txt 가 생성됨");
	}

}
