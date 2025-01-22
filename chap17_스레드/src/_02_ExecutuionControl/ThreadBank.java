package _02_ExecutuionControl;

public class ThreadBank extends Thread{
	Bank bank = new Bank();
	
	@Override
	public void run() {
		while(bank.getBalance() > 0) {
			int money = ((int) (Math.random()*3) +1)*100; // 100, 200, 300
			bank.withdraw(money);
			System.out.println("남은 금액 : " + bank.getBalance());
		}
	}
}