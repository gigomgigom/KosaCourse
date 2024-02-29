package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		while(i<101) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ " + (i-1) + "까지의 합은 " + sum);
	}

}
