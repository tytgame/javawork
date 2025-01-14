package _02_userException;

public class Ex extends Exception{
	Ex() {}
	Ex(String message) {
		super(message);
	}
	
	int add(int x, int y) throws Ex {
		if(x<0 || y<0) {
			throw new Ex("양수만 넣으세요");
		} else
		return x+y;
	}
}
