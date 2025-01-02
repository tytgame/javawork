package _01_string;

import java.util.Scanner;

public class T01_string {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1==name2); // true
		
		String name3 =name1;
		System.out.println(name1 == name3); // true
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println("주소가 같은가?" + str1 == str2); // false, new로 만들었을때는 false로 값이 다르다고 나옴
		System.out.println("그 안의 값이 같은가? " + str1.equals(str2)); // true, 안의 값이 같은지 확인할때는 equals 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 입력(시 또는 도만) : ");
		String city = sc.next();
		
		// if(city == "경기도") -> city의 저장된 주소와 "경기도"가 같은가? --> 당연히 다름
		
		if(city.equals("경기도")) {		// equals("경기도) 써야 함 (O) city == "경기도" (X)
			System.out.println("경기도사람");
		}
		System.out.println("종료");
		
		
		
		
		
		
	}

}
