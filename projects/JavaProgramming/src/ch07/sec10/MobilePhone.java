package ch07.sec10;

public abstract class MobilePhone {
	public String owner;
	
	public MobilePhone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	public abstract void internetSearch();
	//기능은 공통적이지만 안에 들어가는 내용이 각자 다르므로 abstract 워드를 붙여 추상 메소드로 선언한다.

}
