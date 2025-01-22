package _02_ExecutuionControl;

public class T02_Join_main {

	public static void main(String[] args) {
		SumThread sumTh = new SumThread();
		sumTh.start();
		try {
			sumTh.join();					// 연산 끝날때까지 기다리기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~1000까지 합 : " + sumTh.getSum()); // 안기다리면 합계 0 나옴
		
	}

}
