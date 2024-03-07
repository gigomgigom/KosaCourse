package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		double result = cal.areaRectangle(5);
		double result1 = cal.areaRectangle(5, 3);
		
		System.out.println(result);
		System.out.println(result1);
	}

}
