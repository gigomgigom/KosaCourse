package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//리모콘 변수 선언과 동시에 해당 인터페이스와 연결된 객체를 대입한다.
		RemoteControl rc = new Television();
		//리모콘을 통해서 tv의 전원을 킨다.
		rc.turnOn();
		
		
		use(new Television());
		use(new Audio());
	}
	public static void use(RemoteControl rc) { //인터페이스로 구현한 클래스의 객체를 넣을 수 있다.
		rc.turnOn();
	}
}
