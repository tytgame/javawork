package _02_2차원_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_Answer {

	public static void main(String[] args) {
		
		// 1.
		int num1[] = new int[10];
		for(int i=0; i<num1.length; i++) {
			num1[i] = i+1;
			System.out.print(num1[i] + ", ");
		}
		System.out.println();
		System.out.println();

		// 2.		
		int num2[] = new int[10];
		for(int i=0; i<num1.length; i++) {
			num2[i] = 10-i;
			System.out.print(num2[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		
		// 3.
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 갯수 입력 : ");
		int arrCount = sc.nextInt();
		
		int[] num3 = new int[arrCount];
		for(int i=0; i<num3.length; i++) {
			num3[i] = i+1;
			System.out.print(num3[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// 4.
		String str[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(str[1]);
		
		System.out.println();
		System.out.println();
		
		// 5.
		
		/*
		System.out.println("문자열 입력 : ");
		String str1 = sc.next();
		System.out.println("찾을 문자 입력 : ");
		char search = sc.next().charAt(0);
		
		char[] chRe = new char[str1.length()];
		
		int count = 0;
		String index = "";
		// index를 배열 이용해서 풀이
//		int[] index2 = new int[str1.length()];
//		int z = 0;
		
		for(int i=0; i<chRe.length; i++) {
			chRe[i] = str1.charAt(i);
			if ( chRe[i] == search) {
				count++;
				index += i + " ";
//				index2[z++] = i;
			}
		}

		System.out.println(str1 + "에" + search + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(search + "개수 : " + count);
		System.out.println();
		System.out.println();
		
		
		
		// 6.
		char[] days = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.println("0~6사이 숫자 입력 : ");
		int num6 = sc.nextInt();
		
		if (num6 >= 0 && num6 <=6) {
			System.out.println(days[num6] + "요일");
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		System.out.println();
			
		// 7.
		System.out.println("배열의 크기 입력 : ");
		int num7 = sc.nextInt();
		
		int[] arr7 = new int[num7];
		
		int sum = 0;
		for(int i=0; i<num7; i++) {
			System.out.println(i+1 +"번쨰 값 입력 : ");
			arr7[i] = sc.nextInt();
			sum += arr7[i];
		}
		System.out.println("합 : " + sum);
		System.out.println();
		*/
		
		// 8.
		
		/*
		while (true) {
		System.out.print("3이상인 홀수의 정수 입력 : ");
		int num8 = sc.nextInt();
		
		if(num8 >= 3 && num8%2 == 1) {
			int value = 1;
			int[] arr8 = new int[num8];
			for(int i=0;i<arr8.length;i++) {
				if(i < num8/2) {
					arr8[i] = value++; 
				} else {
					arr8[i] = value--;
				}
				
				if (i < arr8.length-1) {
					System.out.print(arr8[i] + ", ");
				} else {
					System.out.print(arr8[i] + "\n");
				}
			}
			break;
		} else {
			System.out.println("다시 입력하세요.");
		}
	}
		System.out.println();
		
		// 9.
		String[] chickens = {"후라이드", "양념", "파닭", "허니버터"};
		System.out.print("치킨 이름 입력 : ");
		String menu = sc.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++	 ) {
			if (menu.equals(chickens[i])) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(menu + "치킨은 배달 가능");
		} else {
			System.out.println(menu + "치킨은 없는 메뉴입니다");
		}
		System.out.println();		
		
		// 11. 버블정렬
		
		
		// 버블 정렬 : 1,2,3,4,5,6 
		
//		1, 2 비교  1 < 2
//		2, 3 비교  2 < 3 ... 두개씩 비교
//		1라운드 6개 정렬 -> 제일 큰 값이 맨 뒤로 감
		
//		2라운드 5개 정렬 ...
		
//		3라운드 4개 정렬 ....
//		2.	select 정렬도 있음 ~~~~~	
		
		int[] bubble = {32, 13, 23, 11, 57, 8};
		
		
		for(int i=0; i<bubble.length-1; i++) {
			boolean flag_bubble = false;
			for(int j=0; j<bubble.length-i-1; j++) {
				if (bubble[j] > bubble[j+1]) {
					int tmp = bubble[j];
					bubble[j] = bubble	[j+1];
					bubble[j+1] = tmp;			// 자리바꿈
					flag = true; 		// 자리바꿈이 일어났다
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(bubble));
		System.out.println();
		*/
		
		
		
		// 12.
		
		// 행 5, 열 3개짜리
		
		int score[][] = {	{98,97,96},
							{87,86,85},
							{77,76,75},
							{65,64,63},
							{57,58,65}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;							// 밑에 for문 돌고나면 sum 값 0으로 초기화됨
			System.out.print(i+1 + "\t");
			for(int j=0; j<score[i].length;j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%d\t%.1f\n", sum, (double)sum/score[i].length);
		}
		System.out.println("-----------------------------------------");

		// 과목별 점수 합계, 평균
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
