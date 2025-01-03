package _02_2차원_Array;

import java.util.Scanner;

public class T02_lotto {

	public static void main(String[] args) {
		// for문을 이용하여 45개 1차원 배열에 값을 1~45까지 넣는다
		// 무작위로 자리바꿈을 해준다
		// 맨앞에서부터 6개만 출력
		
		// 1차원 45개짜리 배열 만들기
		int[] lotto = new int[45]; // 0 ~ 44
		
		// 2. 앞에 1~45까지의 값 넣어주기
		lotto[0] = 1;
		lotto[1] = 2;
		

		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		
		// 3. index번호를 무작위 뽑아서 자리바꿈을 해준다(random 0~44)
		
		int index = 0;
		for (int i=0; i<100; i++) {
			index = (int)(Math.random()*45);
			int tmp = lotto[0];
			
			lotto[0] = lotto[index];
			lotto[index] = tmp;
		}
		
		// 또 다른 풀이
		
		for(int i=0; i<6; i++) {
			index = (int)(Math.random()*45);
			int tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
		}
		
		
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i] + ", ");
		}
		
		
//		
//		// 오름차순으로 정렬
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 5개 입력하세요 : ");
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();
//		
//
//		int[] intArr = new int[5];
//		
//		intArr[0] = num1;
//		intArr[1] = num2;
//		intArr[2] = num3;
//		intArr[3] = num4;
//		intArr[4] = num5;
//		
//		for(int i=0; i<intArr.length; i++) {
//			System.out.print(intArr[i] + " ");
//		}
//		
		
		
	}

}
