package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//인터페이스로 사용할 객체 연결
		rc = new Television();
		rc = new Audio();
		
		rc.setMute(true);
		rc.setMute(false);
		rc.setMute(true);
		
		use(new Television());
		use(new Audio());
	}
	
	public static void use(RemoteControl rc) { //어느 객체를 넣었느냐에 맞춰 결과가 변하게 된다.
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
