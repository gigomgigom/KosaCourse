package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		
		//실수(mistake아님 ㅎ)로 계산을 해보자
		/*
		int apple = 1; //사과가 한개가 있다.
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		이렇게 계산해버리면
		*/
		
		//정수로 계산을 해보자
		int apple = 1;
		int pieceUnit = 10;
		int number = 7;
		
		double result = (pieceUnit - number) * 0.1;
		System.out.println(result);
	}

}
