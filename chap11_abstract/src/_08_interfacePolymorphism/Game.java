package _08_interfacePolymorphism;

public class Game implements product{
	String switchOhterGame;
	boolean power;
	int volume;

	@Override
	public void power() {
		power = !power; 
		if (power) {
			System.out.println("전원을 켭니다");
		} else {
			System.out.println("전원을 끕니다");
		}
	}

	@Override
	public int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	
	@Override
	public String toString() {
		return "game";
	}
	

//	String switchOtherGame(String name) {
//		return name + "게임으로 전환합니다";
//	}

	public void switchOhterGame(String name) {
		System.out.println(name + "으로 전환합니다");
	}
	
	
	
	
	
	
}
