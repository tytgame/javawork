package _02_abstractPhone;

public class FolderPhone extends Phone{
	FolderPhone() {
		super("실버폰","검정");
	}
	
	
	/*	FolderPhone() {
			this("1","2");
		}*/

	@Override
	void hangUp() {
		System.out.println("전화기를 연다");
	}
	@Override
	void hangOut() {
		System.out.println("전화기를 닫는다");
	}
}
