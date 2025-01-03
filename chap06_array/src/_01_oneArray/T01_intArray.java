package _01_oneArray;

public class T01_intArray {

	public static void main(String[] args) {
			/*
			 * 배열 : '같은 자료형'을 연속된 저장공간에 저장
			 * 특징 
			   1. 배열의 길이를 지정하면 늘리거나 줄일 수 없다
			   2. 배열에서 각각의 값을 가져오거나 넣을때는 index번호 사용
			      index번호는 무조건 0부터 시작
			   
			   
			   
			   
			   
			  *사용법
			  
			  - 저장공간만 확보하고 나중에 값을 넣을 때
배열의 표시 -> []   int[] 변수명 = new int[갯수];       <---- 갯수 반드시 넣어야함
				 int 변수명[] = new int[갯수];
				 
			  - 배열을 만들면서 값을 바로 넣을 때
			  	 int[] 변수명 = {1,2,3,4, ... };
			 */
		
		int arrayInt[] = new int[10];		// 40byte의 저장공간 생성
		int[] arrayInt2 = new int[5];		// 20byte의 저장공간 생성
		
		int[] arrayInt3 = {1,2,3,4,5};
		System.out.println("index번호 3번의 값 : " + arrayInt3[3]);	 // 4
		System.out.println("index번호 0번의 값 : " + arrayInt3[0]);

		arrayInt3[0] = 20; // index번호 0번의 값에 20 넣기
//		System.out.println(arrayInt3[0]);
//		System.out.println(arrayInt3[1]);
//		System.out.println(arrayInt3[2]);
//		System.out.println(arrayInt3[3]);
//		System.out.println(arrayInt3[4]);
		
		System.out.println("--------------------------");
		for(int i=0;i<5;i++) {
			System.out.println(arrayInt3[i]);
		}
		
//		arrayInt3[0] = 0;
//		arrayInt3[1] = 2;
//		arrayInt3[2] = 4;
//		arrayInt3[3] = 6;
//		arrayInt3[4] = 8;
		System.out.println("--------------------------");

		
		for(int i=0; i<5;i++) {
			arrayInt3[i] = i*2;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(arrayInt3[i]);
		}
		System.out.println("--------------------------");
		
		for(int i=0;i<10;i++) {
			System.out.println(arrayInt[i]);
		}
		System.out.println("--------------------------");
		// length : 배열의 길이
		int int1[] = {4,6,7,8,9,10,3};
		int int2[] = new int[5];
		
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		
		for(int i=0;i<int1.length; i++) {
			System.out.println(int1[i]);
		}
		System.out.println("--------------------------");

		/*
		 1. 배열의 길이가 5인 배열 만들기 (int형)
		 2. 1번 배열에 for문으로 0,3,6,9,12 값 넣기
		 3. 1번 배열 돌면서 합계 구하여 출력하기
		 */
		
//		int newArray[] = new int[5];
//		int sum = 0;
//		
//		for(int i=0;i<newArray.length;i++) {
//			newArray[i] = 3*i;
//			sum += newArray[i];
//		}
//		System.out.println(sum);
//		

		int[] num = new int[5];
		int sum1 = 0;
		
		for(int i=0;i<num.length; i++) {
			num[i] = i*3;
			if (i == (num.length-1)) {			// i == 4 일때
				System.out.print(num[i] + "\n");
			} else {
				System.out.print(num[i] + ", ");
			}
//			System.out.print(num[i] + ", ");
			sum1 += num[i];
		}
		System.out.println(sum1);
		
//		int sum = 0;
//		for(int i=0; i<num.length;i++) {
//			sum += num[i];
//		}
//		System.out.println(sum);
		
	}

}
