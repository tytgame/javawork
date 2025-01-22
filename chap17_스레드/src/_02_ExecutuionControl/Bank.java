package _02_ExecutuionControl;

public class Bank {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw (int money) {		// synchronized -> 동기화
		if(balance >= money) {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
	

}
