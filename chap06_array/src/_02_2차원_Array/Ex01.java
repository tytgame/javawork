package _02_2차원_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
//		1. 길이 10인 배열을 선언하고 1~10까지 반복문을
//		   이용하여 순서대로 넣고 출력하기
		
		int[] intArr = new int[10];
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = i+1;
			System.out.print(intArr[i]+", ");
		}
		System.out.println();
		System.out.println("--------------------------------");
//
//		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
//		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
		
		int[] intArr2 = new int[10];
		
		for(int i=0;i<intArr2.length;i++) {
			intArr2[i] = 10-i;
			System.out.print(intArr2[i]+", ");
		}
//
//		3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
//		   1~입력받은 수를 차례대로 넣어 출력
		System.out.println();
		System.out.println("--------------------------------");
		
		
		System.out.println("만들 배열의 수를 입력하세요 : ");
		int number = sc.nextInt();
		
		int[] intArr3 = new int[number];
		
		for(int i=0; i<intArr3.length; i++) {
			intArr3[i] = i+1;
		}
		
		System.out.println(Arrays.toString(intArr3));
//
//		4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
//		   배열 인덱스를 이용하여 귤 출력
		
		String[] stArr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(stArr[1]);
		
//
//		5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
//		   ex)
//		   문자열 : application -> String
//		   문자 : i
//		   application에 i가 존재하는 위치(인덱스) : 4 8 
//		   i 개수 : 2
		
//		System.out.println("문자열을 입력하세요 : ");
//
//		String word = sc.next();
//		
//		String[] wordArr;
//		
////		word.charAt(0); word.charAt(1); // / / /// 
//		for(int i=0;i<word.length();i++) {
//			wordArr[i] = word.indexOf(i);
//		}
		
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
//
//		6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
//		   숫자와 같은 요일 출력
//		   ex.
//		   0 ~ 6 사이 숫자 입력 : 4			
//		   금요일
//		   0 ~ 6 사이 숫자 입력 : 7
//		   잘못 입력하셨습니다.
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("숫자 (0~6)를 입력하세요 : ");
		int week_num = sc.nextInt();
		
		if (week_num <7) {
			System.out.println(week[week_num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
//
//		7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
//		   배열 전체의 합 출력
		
		System.out.println("배열의 크기를 입력하세요 : ");
		
		int scale = sc.nextInt();
		int[] scaleArr = new int[scale];
		
		System.out.println("배열에 들어갈 숫자를 입력하세요 : ");
		int scale_num = sc.nextInt();
		
		for(int i=0;i<scaleArr.length;i++) {
			scaleArr[i] = scale_num;
		}
		System.out.println(Arrays.toString(scaleArr));
		
		int sum_scale = 0;
		
		for(int i=0; i<scaleArr.length; i++) {
			sum_scale += scaleArr[i];
		}
		System.out.println("배열 전체의 합은 : " + sum_scale);
		
		
//
//		8. 3이상인 홀수 자연수를 입력 받아
//		배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		   다시 정수를 받도록 하세요.
//
//		   ex.
//		   정수 : 4
//		   다시 입력하세요.
//		   정수 : -6
//		   다시 입력하세요.
//		   정수 : 5
//		   1, 2, 3, 2, 1
//		
//		7
//		1 2 3 4 3 2 1
		
		int oddNum = 0;
		do {
			System.out.println("3 이상인 홀수 자연수를 입력하세요 : ");
			oddNum = sc.nextInt();
			if(oddNum < 3 || oddNum%2 == 0 ) {
				System.out.println("다시 입력하세요");
			}
		} while (oddNum < 3 || oddNum%2 == 0 );
		
		int[] oddArr = new int[oddNum];
		
		for(int i =0;i<oddNum;i++) {
			if (i <= oddNum/2) {
				oddArr[i] = i+1;
			} else {
				oddArr[i] = oddNum-i;
			}
		}
		
		//
		//
		//
		
		// TODO : 1 2 3 2 1 / 1 2 3 4 5 4 3 2 1 이런 배열 만들기
//		for(int i=0; i<evenNum; i++) {
//			evenArr[i] = i+1;
//		}
		
		System.out.println(Arrays.toString(oddArr)); // <-- 이걸로 확인
		

		
//
//		9. 사용자가 입력한 값이 배열에 있는지 검색하여
//		   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		   ex.
//		   치킨 이름을 입력하세요 : 양념			
//		   양념치킨 배달 가능
//
//		   치킨 이름을 입력하세요 : 불닭
//		   불닭치킨은 없는 메뉴입니다.
		
		System.out.println("치킨 이름을 입력하세요 : ");
		String name_chicken = sc.next();
		
		String[] menu_chicken = new String[] {"양념", "후라이드"};
		
		if(name_chicken.equals("양념") || name_chicken.equals("후라이드")) {
			System.out.println(name_chicken + "치킨 배달 가능");
		} else {
			System.out.println(name_chicken + "치킨은 없는 메뉴입니다.");
		}
		
		
		// 질문 1 if 조건식 안에 for문 사용 불가 ?? 메뉴가 무수히 많을땐 어떻게하지
//		if(
//				for(int i=0;i<menu_chicken.length;i++) {
//					name_chicken.equals(menu_chicken[i]);
//				}
//				) {
//			System.out.println(name_chicken + "치킨 배달 가능");
//		} else {
//			System.out.println(name_chicken + "치킨은 없는 메뉴입니다.");
//		}
		
		
		
		
		
//
//		10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		     1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//		     ex.
//		     5 3 2 7 4 8 6 10 9 10
//		     최대값 : 10
//		     최소값 : 2
		
		
		
		
		
		
//
//		11. 사용자로부터 정수값 5개 배열에 입력
//		   오름차순 정렬로 정렬하기
		
		
		
		
		
//
//		12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
//		   각 과목별 총점과 평균을 구해 아래와 같이 출력하기
//		   점수는 2차원 배열로 마음대로 넣는다.
//
//		  번호  국어  영어  수학  총점  평균
//		-----------------------------------------
//		   1     95    100     78   273  83.3
//		   2     68     57    100   273  83.3
//		   3     62     97     85    273  83.3
//		   4     85     83     69    273  83.3
//		   5     86     74     38    273  83.3
//		------------------------------------------
//		총점   479   500   387 
//		평균  95.0  100.0  78.3
//		
//		
//		
//		
//		
		
		
		
		
		
	}

}