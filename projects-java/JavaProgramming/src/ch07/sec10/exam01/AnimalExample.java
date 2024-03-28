package ch07.sec10.exam01;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-Cat 타입 Cat객체 생성 cat-");
		Cat cat = new Cat("한국고양이", "노랑");
		System.out.println("");
		cat.breathe();
		cat.sound(); //야옹이 출력되어야함.
		cat.catchMouse();
		
		System.out.println("-Dog 타입 Dog객체 생성 dog-");
		
		Dog dog = new Dog("진돗개", "흰색");
		dog.breathe();
		dog.sound(); //왈왈이 출력되어야함.
		dog.keepHouse();
		
		System.out.println("-Animal 타입 Cat객체 생성 cat1-");
		
		Animal cat1 = new Cat("뱅갈호랑이", "주황색");
		cat1.breathe();
		cat1.sound();
		if(cat1 instanceof Cat cat2) {
			cat2.catchMouse();
		}
		
		Animal dog1 = new Dog("요크셔테리어", "갈색");
		dog1.breathe();
		dog1.sound();
		if(dog1 instanceof Dog dog2) {
			dog2.keepHouse();
		}
		
	}
	
	public static void dailyLife(Animal animal) {
		animal.breathe();
		animal.sound(); //다형성 제공
	}

}
