package _02_method;

public class T01_api_op {
	// 5칙 연산
	
	// 메소드 4개
	// +, -, *, % = 반환형이 int형
	//  	/     = 반환형이 double형
	
	// 매개변수 int형으로 2개 받기
	
	int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	int sub(int num1, int num2) {
		int minus = num1 - num2;
		return minus;
	}
	
	int multi(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}
	
	int remain(int num1, int num2) {
		int remaining = num1 % num2;
		return remaining;
	}
	
	double div(double num1,double num2) {
		double divide = num1 / num2;
		return divide;
	}
	
}
