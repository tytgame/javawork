package _04_staticEx;

// 다른 package의 클래스를 이용하려면 import한 후 사용가능
// import 패키지이름.클래스이름 (클래스이름은 패키지이름.클래스이름이 원래 클래스 이름)

import _03_bank.Bank;
import _02_car.*;

public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(9000);
		bank.getBalance();
		bank.withdraw(5000);
		bank.getBalance();
		
		Ambulance ab = new Ambulance("amCar", "기아");
		System.out.println(ab.model);
		ab.siren();
		
	}
}
