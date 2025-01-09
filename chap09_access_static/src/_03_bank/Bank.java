package _03_bank;

public class Bank {
	private int balance;
		//	int balance2;

	public void deposit(int amount) {
		System.out.println(amount + "원을 입금합니다.");
		balance += amount;
		}
	
	//int deposit2 (int amount2) {
	//	balance2 += amount2;
	//	System.out.println(amount2 + "원을 입금했습니다.");
	//	return amount2;
	//}


	public void withdraw(int amount) {
		if (amount <= balance) {
			System.out.println(amount + "원을 출금합니다.");
			balance -= amount;
		} else
			System.out.println("계좌에 잔액이 부족합니다. 현재 잔액 : " + balance);
	}


	public void getBalance() {
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}



}