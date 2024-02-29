package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10; //int타입의 var1변수에 10을 저장한다.
		//byte var2 = var1; byte타입보다 큰 범위를 가진 int타입값이 byte타입에 들어올 수 없다.
		byte var2 = (byte) var1; //int타입의 변수를 byte타입으로 강제형변환을 시켜 var2변수에 대입한다.
		System.out.println(var2);
		
		long var3 = 300; //long타입의 var3변수에 300을 저장한다.
		//int var4 = var3; int타입 변수에 더 큰 범위를 가진 long타입의 값이 들어올 수 없다. 컴파일 에러
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65; //int타입의 var5변수에 65를 저장한다.
		// char var6 = var5; int타입 범위에는 char타입이 가질 수 없는 음수를 포함하고 있으므로 자동변환이 안된다. 컴파일 에러
		char var6 = (char) var5; //
		System.out.println(var6);
	}

}
