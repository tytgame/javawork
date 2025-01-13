package _08_interfacePolymorphism;

public interface product{
	void power();	// public abstract 생략
	int volume(int volumeInput);

	public static void AISpeak(String str) {
		System.out.println(str);
	}
	
	default void search(String search) {
		System.out.println(search);
	}
}

	

/*
interface talkAi {
	default String index() {
		return "안녕하세요 AI입니다";
	}
}
*/	/*
interface search {
	static String searching(String searching) {
		return "검색내용 : " + searching;
	}
}
	*/
	


