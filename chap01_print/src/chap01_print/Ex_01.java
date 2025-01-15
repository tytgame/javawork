package chap01_print;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * // 하루에 생산하는 과일의 개수
		int a = 5; // 배 개수
		int b = 6; // 사과 개수
		int c = 7; // 오렌지 개수
		
		// 1
		// 하루 생산되는 과일의 총 갯수
		int sum_fruit = a+b+c; // 18
		
		// 2
		// 시간당 과일의 생산 갯수
		float perHour = (float)(a+b+c)/24; // 0.75개
		
		System.out.println("하루에 생산되는 과일의 총 갯수 : " + sum_fruit);
		System.out.println("시간당 과일의 생산 갯수 : " + perHour);
		
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 : " + sum);
		
		System.out.println("------------------------------");
		
		System.out.println("정수 두 개를 입력하세요 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int tmp;
		
		// 둘 중 큰 수를 n1, 작은 수를 n2에 대입
		if (n1 < n2) {
			tmp = n2;
			n2 = n1;
			n1 = tmp;
		}
		
		int sum_n1n2 = 0;
		for(int i=n2;i<=n1;i++) {
			sum_n1n2 += i;
		}
		System.out.println("합계는 : " + sum_n1n2);
		
		*
		*/
		System.out.println("-------------------------------");
		
		// 2-2
		// String 타입 ,
		String regNo = "981111-1234567";
		
		// 2-3
		// 리터럴 : 100 , 100L , 3.14
		// 변수 : int , long, float
		// 상수 : final
		// 키워드 : i , l , PI
		
		// 2-4
		// b. Byte
		
		// 2-5
		// 12
		// true
		// AB
		// 오류
		// 12
		// 오류
		// 오류
		
		// 3-2
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket)+1;
		
		System.out.println("필요한 바구니의 수 :" +numOfBucket);
		
		// 3-3
		int num = 10;
		System.out.println(num < 0 ? "음수" :
							num > 0 ? "양수" : "0");
		
		// 3-4
		int num2 = 456;
		System.out.println(
					(int)(num2/100)*100);
		
		// 3-5
		int num3 = 333;
		System.out.println(
						(int)(num3/10)*10 +1);
		
		// 3-6
		int num4 = 24;
		System.out.println(
					(int)((num4/10)+1)*10	// 가장 가까운 값. 지금은 30
					%num4
				);
		
		// 3-7
		int fahrenheit = 100;
		float celcius= ((float)5/9 * (fahrenheit-32));
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + String.format("%.2f", celcius));
		
		// 3-8
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		// 4-2
		// 1 ~ 20 총합 구하고 2 또는 3의 배수 총합 빼기
		// 위에처럼 하는것 보다 그냥 2 또는 3의 배수면 컨티뉴로 빼기
		int sum = 0;
		for(int i=1;i<=20;i++) {
			if(i%2 == 0 || i%3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
//		int sum_multi = 0;
//		for (int i=1;i<=20;i++) {
//			
//		}
		
		// 4-3
		/*
		1
		12
		123
		1234
		12345
		.
		.a.
		12345678910*/
		int sum2 = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				sum2 += j;
			}
			sum2 += i;
		}
		System.out.println(sum2); 	// 605
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
