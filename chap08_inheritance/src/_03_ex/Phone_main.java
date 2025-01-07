package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("갤럭시", "아이보리");
		
		phone1.bell();
		phone1.hangUp();
		phone1.hangOut();
		phone1.sendVoice();
		phone1.receiveVoice();
		
		phone1.search("가나다");
		
	}

}
