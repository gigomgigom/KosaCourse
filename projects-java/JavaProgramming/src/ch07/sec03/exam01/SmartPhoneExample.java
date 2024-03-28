package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println(smartPhone.model);
		System.out.println(smartPhone.color);
		
		System.out.println(smartPhone.wifi);
		smartPhone.setWifi(false);
		System.out.println(smartPhone.wifi);
		
		smartPhone.bell();
		smartPhone.sendVoice("여보세요");
		smartPhone.receiveVoice("안녕하세요 저는 홍길동인데요.");
		smartPhone.sendVoice("아~ 네 반갑습니다!");
		smartPhone.hangUp();
		smartPhone.setWifi(true);
		smartPhone.internet();
	}

}
