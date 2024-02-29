package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int m = 2; m < 10; m++) {
			System.out.println("*** " + m + " ***"); 
			for(int n = 1; n < 10; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}

}
