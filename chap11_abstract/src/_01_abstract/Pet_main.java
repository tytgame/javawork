package _01_abstract;

public class Pet_main {

	public static void main(String[] args) {
		
//		
//		Pet pet1 = new Cat();
//		
//		pet1.info();
//		
//		Pet pet2 = new Dog();
//		
		//////////////////////////////
		System.out.println("--------------------");
		Pet_Answer pet = new Frog_Answer("황소개구리","갈색","엄청먹음");
		pet.info();
		System.out.println(pet);
		System.out.print("울음소리 : ");
		pet.sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		
		System.out.println("--------------------");

		pet = new Cat_Answer();
		pet.info();
		System.out.println(pet);
		System.out.print("울음소리 : ");
		pet.sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		
		System.out.println("--------------------");
		pet = new Dog_Answer();
		pet.info();
		System.out.println(pet);
		System.out.print("울음소리 : ");
		pet.sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		
	}

}
