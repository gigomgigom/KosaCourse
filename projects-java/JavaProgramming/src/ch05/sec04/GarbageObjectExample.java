package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "trip"; //String 타입의 hobby 변수를 선언하며 값에 "trip"을 저장하고 그 메모리 번지를 hobby변수에 저장한다.
		hobby = null; //hobby변수의 메모리 번지를 null로 대입한다.
		System.out.println(hobby); //결과값은 null
		
		String kind1 = "car"; //String 타입의 kind1 변수를 선언하며 값에 "car"을 저장하고 그 메모리 번지를 kind1변수에 저장한다.
		String kind2 = kind1; //kind2 변수 번지수를 kind1 변수 번지수와 같게 한다. 대입한다.
		kind1 = null; //kind1 변수의 번지수를 null값으로 대입한다.
		System.out.println("kind2: " + kind2); //결과값 car
	}

}
