package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj = 100;
		System.out.println("Value : " + obj.intValue());
		
		int value1 = obj;
		System.out.println("value1 : " + value1);
		
		int result1 = obj + 100;
		System.out.println("result : " + result1);
	}

}
