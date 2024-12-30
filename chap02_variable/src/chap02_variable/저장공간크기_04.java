package chap02_variable;

public class 저장공간크기_04 {
	public static void main(String[] args) {
		System.out.println("byte크기 = " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); // -128 ~ 127
		System.out.println("short크기 = " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE); // -32768 ~ 32767
		System.out.println("int크기 = " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); // -2147483648 ~ 2147483647
		System.out.println("long크기 = " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE); // -9223372036854775808 ~ 9223372036854775807
		
		System.out.println("char크기 = " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE); // 0 ~ 65535
		
	}

}