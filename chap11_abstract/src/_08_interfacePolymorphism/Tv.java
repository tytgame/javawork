package _08_interfacePolymorphism;

public class Tv implements product{
	int channel;
	boolean power;
	int volume;
	
	@Override
	public String toString() {
		return "Tv";
	}
	
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
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	@Override
	public void search(String search) {
		System.out.println(search + "를 유튜브에서 검색합니다");
	}

}
