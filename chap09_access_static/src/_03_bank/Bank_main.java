package _03_bank;

public class Bank_main {

	public static void main(String[] args) {
		Bank account1 = new Bank();
		
		account1.deposit(10000); // 10000원 입금
		
//		System.out.println(account1.balance);
		
		account1.withdraw(50000); // 50000원 출금. 출금 안됨
		
		account1.withdraw(5000); // 5000원 출금.
		
		account1.getBalance();// 잔액 확인. 5000원
		
//		System.out.println(account1.deposit2(999999));
	}

}
