package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte result1 = 10 + 20;
		
		byte v1 = 10;
		byte v2 = 20;
		//int형보다 작은 타입의 값들은 실행될때 항상 int형으로 자동변환 되므로 컴파일 에러가 발생하게 된다.
		//byte result2 = v1 + v2;
		int result2 = v1 + v2;
		System.out.println(result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		//다른 타입의 변수 두개 이상을 가지고 산술연산을 할 경우 그 들중 가장 큰 범위인 타입으로 전부 형변환이 이루어지게 된다.
		long result3 = v3 + v4 + v5;
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println((char) result4);
	
		int v8 = 10;
		int result5 = v8 / 4;
		// int형 변수들을 가지고 '/'연산을 하게 되면 결과값은 소숫점을 제외한 정수형의 결과값이 나오게 되므로 2라는 값이 저장이 된다.
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = (double) v9 / 4;
		// v9의 변수값이 double형식으로 변환이 되었으므로 연산에 사용되는 모든 변수의 타입이 double형식으로 변환이 된다. 그러므로 값은 2.5가 나오게된다.
		System.out.println(result6);
	}

}
