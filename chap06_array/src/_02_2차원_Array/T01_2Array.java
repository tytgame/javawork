package _02_2차원_Array;

public class T01_2Array {

	public static void main(String[] args) {
			// 2차원 배열 : [행 index 번호][열 index 번호]
			// 
			// 배열을 선언하면서 값을 넣을 때
	//							0열 ->   4열
			int[][] score = {	{1, 2, 3, 4, 5},   // [0] -> 행의 index번호
							 	{6, 7, 8, 9, 0},   // [1]
							 	{7, 6, 5, 4, 3}	 };// [2]
				// 열의 index번호 [0][1][2][3][4]
			
			System.out.println(score[2][3]);  // 3행 4열 : 4 출력
			System.out.println(score[0][1]);  // 1행 2열 : 2 출력
			
			for(int row=0; row<score.length; row++) { 	// 행의 길이만큼, == 3
				for (int column=0; column <score[row].length;column++) {
					System.out.print(score[row][column] + " ");
				}
				System.out.println();
			}
			
			System.out.println("----------------------------");
		

			// 배열을 선언만 할 때
			int[][] score3 = new int[4][3];
	//		System.out.println("score2의 행의 길이 : " + score2.length); 	// length -> 행의 길이출력
	//		System.out.println(score2[0]);

		
		
			int[][] score2 = {	
						{1, 2, 3, 4, 5},   // [0] -> 행의 index번호
		 				{6, 7, 8},   	   // [1]
		 				{7, 6, 5, 4}
		 									};
			
			for(int row=0; row<score2.length; row++) {
				for (int column=0; column <score2[row].length;column++) {
					System.out.print(score2[row][column] + " ");
				}
				System.out.println();
			}
			
			System.out.println("---------------------------------");
			
		
			System.out.println("score2의 행의 길이 : " + score2.length); 			// length -> 행의 길이출력
			System.out.println("score2[0]의 열의 길이 : " + score2[0].length);		// 첫 번째 행의 길이
			System.out.println("score2[1]의 열의 길이 : " + score2[1].length);		// 두 번째 행의 길이
			System.out.println("score2[2]의 열의 길이 : " + score2[2].length);		// 세 번째 행의 길이
			

		
	}

}
