package ch07.sec10.exam01;

public class Dog extends Animal{
	
	public Dog(String kind, String color) {
		super(kind, color);
	}
	
	public void sound() {
		System.out.println("왈왈~");
	}
	
	public void keepHouse() {
		System.out.println("집을 지킵니다.");
	}
}
