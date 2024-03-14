package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "심영조"; //문자열 리터럴 대입
		String strVar2 = "심영조";
		
		if(strVar1 == strVar2) { //문자열 객체의 번지 비교
			System.out.println("strVar1과 strVar2가 참조하는 객체가 서로 같음");
		} else {
			System.out.println("strVar1과 strVar2가 참조하는 객체가 서로 다름");
		}
		
		if(strVar1.equals(strVar2)) { //갖는 문자열값이 같은지 비교
			System.out.println("strVar1과 strVar2가 가지고 있는 내부값이 서로 같음");
		}
		
		String strVar3 = new String("시맹조"); //new연산자로 새로운 문자열 객체를 생성
		String strVar4 = new String("시맹조");
		
		if(strVar3 == strVar4) { //문자열 객체의 번지를 비교
			System.out.println("strVar3과 strVar4가 참조하는 객체가 서로 같음");
		} else {
			System.out.println("strVar3과 strVar4가 참조하는 객체가 서로 다름");
		}
		
		if(strVar3.equals(strVar4)) { //갖는 문자열 값이 같은지 비교
			System.out.println("strVar3과 strVar4가 가지고 있는 내부값이 서로 같음");
		}
	}

}
