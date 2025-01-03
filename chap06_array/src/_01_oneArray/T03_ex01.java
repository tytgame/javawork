package _01_oneArray;

public class T03_ex01 {

	public static void main(String[] args) {
		// 1. 총점과 평균 출력
		int score[] = {100, 98, 49, 78, 86};
		
		int sum = 0;
		double avg;
		for(int i=0;i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점 : " + sum);
		
		avg = sum/score.length;
		System.out.println("평균 : " + avg);
		System.out.println("--------------------------");
		
		
		// 2. 최대값과 최소값 구하기
		int num[] = {83, 70, 27, 49, 20, 86, 90, 83, 58, 29}; // 변수 만들고, 작은값 비교해서 변수에 넣기 ... 반복하기
		
		int min = num[0];
		int max = num[0];
		
		for(int i=1; i<num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		
		
		
		
		
		
		

		
//		for(int i=0;i<num.length;i++) {
//			if ( num[i] - num[i+1] <0 ) {
//				min_num = num[i];
//			}
//		}
//		System.out.println(min_num);
		
//		0보다 작으면 저장, 아니면 패스
		
//		[0] [1] 비교 --> 작은값 : 두 개 빼서 양수가 되면 저장 
		
//		83 > 70 -> 70
		
		
		
		
		
		
		
		
		// 결과 
		//	최소값 : 20
		//	최대값 : 90
		
		
		
//		[행][열]
		
		// 1차원 배열: [열]
		// 2차원 배열: [행][열]
		// 3차원 배열: [z][행][열]
		
		
	}

}
