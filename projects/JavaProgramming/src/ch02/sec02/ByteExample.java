package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;
		
		byte v1 = 30;
		byte v2 = 50;
		//자바는 int타입 변수를 가지고 연산을 할 때 4바이트 단위로 변환시켜 연산작업을 수행한다. 고로  
		//컴파일이 다 되고나서 실행을 할때 연산작업이 수행되므로
		//byte result = v1 + v2;
		//javac 컴파일러가 컴파일할때 연산작업이 수행된다. 이 연산작업은 컴파일하고 나온 bin디렉토리 내의 바이트 코드 파일을 확인해서 알아보도록 하자
		byte result1 = 30 + 50;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);
		
	}

}
