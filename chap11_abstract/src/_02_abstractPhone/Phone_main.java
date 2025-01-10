package _02_abstractPhone;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("갤럭시", "아이보리");
		
		phone1.bell();
		phone1.hangUp();
		phone1.hangOut();
		phone1.sendVoice("123");
		phone1.receiveVoice();
		
		phone1.search("가나다");
		
		System.out.println(phone1.model);	// 갤럭시
		System.out.println(phone1.color);	// 아이보리
		
		System.out.println("-------------------");
		FolderPhone fp = new FolderPhone();
		System.out.println(fp.model);
		System.out.println(fp.color);
		fp.hangUp();
		fp.hangOut();
		System.out.println("-------------------");
		
//		Phone p2 = new Phone(); 		---> 
//		Phone p2 = new Phone("1", "2");	  	Phone클래스가 추상클래스라서 객체 생성 불가능
	}

}
