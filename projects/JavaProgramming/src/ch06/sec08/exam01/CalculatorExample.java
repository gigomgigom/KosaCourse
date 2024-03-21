package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(3, 5);
		System.out.println("더하기 결과" + result1);
		
		int x = 9;
		int y = 2;
		double result2 = cal.divide(x, y);
		System.out.println("나누기 결과" + result2);
	}
}