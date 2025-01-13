package _07_ex;

public class Game implements product{
	String switchOhterGame;
	boolean power;
	int volume;

	@Override
	public void power() {
		power = !power; 
		if (power) {
			System.out.println("게임기를 켭니다");
		} else {
			System.out.println("게임기를 끕니다");
		}
	}

	@Override
	public int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	

//	String switchOtherGame(String name) {
//		return name + "게임으로 전환합니다";
//	}

	public void switchOhterGame(String name) {
		System.out.println(name + "으로 전환합니다");
	}
	
	
	
	
	
	
}
