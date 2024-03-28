package ch07.sec10;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MobilePhone mp = new MobilePhone("홍길동"); 
		//MobilePhone클래스는 추상클래스이므로 객체 생성이 불가능하다.
		
		AndroidPhone ap = new AndroidPhone("홍길동");
		ap.turnOn(); //MobilePhone 클래스 내부의 turnOn메소드 호출
		ap.turnOff(); //MobilePhone 클래스 내부의 turnOff메소드 호출
		ap.internetSearch(); //AndroidPhone 클래스 내부의 internetSearch메소드 호출(왜냐. )
		Iphone ip = new Iphone("김자바");
		ip.turnOn();
		ip.turnOff();
		ip.internetSearch();
		
		MobilePhone mp;
		mp = new AndroidPhone("흉길동");
		mp.turnOn();
		mp.internetSearch();
		mp.turnOff();
	}

}
