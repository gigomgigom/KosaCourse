package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		double result1 = com.areaCircle(10);
		
		Calculator calc = new Calculator();
		double result2 = calc.areaCircle(10);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
