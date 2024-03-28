package ch07.sec02;

public class SmartPhone extends Phone {
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		//자동적으로 컴파일러가 super();라는 실행문이 작성이 됩니다.
		super(); //부모의 생성자를 실행하는 실행문
		System.out.println("자식 클래스 생성자 실행");
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경하였습니다.0");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
