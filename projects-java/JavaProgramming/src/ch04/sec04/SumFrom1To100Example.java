package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for(i = 0; i < 101; i++) {
			sum += i;
		}
		
		System.out.printf("1~%d   합 : %d", i-1, sum);
	}

}
