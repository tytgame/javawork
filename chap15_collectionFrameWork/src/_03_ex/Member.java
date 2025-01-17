package _03_ex;

public class Member {
	private String name;
	private int age;
	private String gender;
	
	Member() { }
	Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
		
	public String setName(String name) {
		return this.name = name;
	}	
	public int setAge(int age) {
		return this.age = age;
	}
	public String setGender(String gender) {
		return this.gender = gender;
	}
	public String getName(String name) {
		return name;
	}	
	public int getAge(int age) {
		return age;
	}
	public String getGender(String gender) {
		return gender;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "나이 : " + age + "성별 : " + gender;
	}
}
	

