package _01_ArrayList;

public class Board {
	private String subject;
	private String writer;
	private String content;
	
	// 생성자 2개
	// 빈 생성자
	// 모든 필드가 있는 생성자
	Board() { }
	Board(String subject,String writer, String content) {
		this.subject = subject;
		this.writer = writer;
		this.content = content;
	}
	// 각 필드의 setter/getter 메서드
	String setSubject (String subject) {
		return this.subject = subject;
	}
	String setWriter (String writer) {
		return this.writer = writer;
	}
	String setContent (String content) {
		return this.content = content;
	}
	
	String getSubject () {
		return subject;
	}
	String getWriter () {
		return writer;
	}	
	String getContent () {
		return content;
	}
	
	// toString 오버라이딩
	// 제목 : ???, 글쓴이 : ???, 가격 : ???
	
	@Override
	public String toString() {
		return "제목 : " + subject + " 글쓴이 : " + writer + " 가격 : " + content;
	
	}
}



