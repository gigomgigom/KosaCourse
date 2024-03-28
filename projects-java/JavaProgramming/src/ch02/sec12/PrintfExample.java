package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value); //정수형 값 그대로 출력
		System.out.printf("상품의 가격: %6d원\n", value); //정수형 값을 6자리 숫자로 우측정렬해서 출력
		System.out.printf("상품의 가격: %-6d원\n", value); //정수형 값을 6자리 숫자로 좌측정렬해서 출력
		System.out.printf("상품의 가격: %06d원\n", value); //정수형 값을 6자리로 표현하는데 좌측 빈공간을 0으로 채워라.
		
		double area = 3.1459 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		//숫자 1 -> 정수값을 6자리숫자로 우측정렬해서 표현하라
		//name -> 10자리 문자열에 name변수값을 왼쪽에 붙여라
		//job -> 10자리 문자열에 job변수값을 우측에 붙여라
	}

}
