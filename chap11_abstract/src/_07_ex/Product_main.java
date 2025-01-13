package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		// tv
		Tv tv1 = new Tv();
		tv1.volume(10); // 볼륨을 10으로 설정
		
		System.out.println("현재 볼륨은 " + tv1.volume + " 입니다.");
		
		tv1.power(); // 전원 켜기
		System.out.println("전원 : " + tv1.power);
		
		System.out.println("현재 채널은 : " + tv1.channel); // 채널 조정
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("현재 채널은 : " + tv1.channel);
		
		System.out.println("------------------------------");
		//게임기
		
		Game game1 = new Game();
		game1.volume(10);
		System.out.println("현재 볼륨은 " + game1.volume + "입니다");
		
		game1.power();
		System.out.println("게임기 전원 : " + game1.power);
		
		game1.switchOhterGame("다른게임2");
		
		System.out.println("-----------------------------");
		game1.search("메이플 스토리");
		product.AISpeak("가나다라");
	}

}
