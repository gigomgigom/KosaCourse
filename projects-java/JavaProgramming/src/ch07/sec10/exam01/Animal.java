package ch07.sec10.exam01;

public abstract class Animal {
	public String kind;
	public String color;
	
	public Animal(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	
}
