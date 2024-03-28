package ch03.sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2; //더하기, int 타입 이하의 정수형 변수끼리의 연산의 결과는 무조건 int타입으로 나온다.
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4; //그 중 int타입 범위보다 큰 long타입 변수가 피연산자에 들어올경우 연산의 결과는 long타입으로 나온다.
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 /v2;//v1변수를 double타입으로 강제형변환시킨 후 연산을 하면 결과값은 실수가 나오게된다.
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2; //나머지 산출
		System.out.println("result4: " + result4);
	}

}
