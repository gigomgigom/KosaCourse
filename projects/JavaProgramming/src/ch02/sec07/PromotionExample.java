package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10; //byte타입의 byteValue변수에 10을 저장한다.
		int intValue = byteValue; //int타입의 intValue변수에 byteValue변수값을 저장한다.
		System.out.println(intValue);
		
		char charValue = '가'; //char타입의 charValue변수에 '가'를 저장한다.
		intValue = charValue; //intValue변수에 charValue변수값을 저장한다.
		System.out.println(intValue);
		
		intValue = 50; //intValue변수에 50을 저장한다.
		long longValue = intValue; //long타입의 longValue변수에 intValue변수값을 저장한다.
		System.out.println(longValue);
		
		longValue = 100; //longValue 변수에 100을 저장한다.
		float floatValue = longValue; //float타입의 floatValue값에 longValue변수값을 저장한다.
		
		floatValue = 100.5F;
		//floatValue = 100.5; 이 코드는 컴파일 오류가 발생하는것을 확인할 수 있다. 
		//(사유: 자바는 실수형의 숫자가 들어오면 해당 데이터를 Double타입으로 받아들인다.
		double doubleValue = floatValue;
	}

}
