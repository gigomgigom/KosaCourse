package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3; //변수 x에 3을 저장
		int y = 5; //변수 y에 5를 저장
		
		System.out.println("x : " + x + " y : " + y); //일단 초기화된 변수의 변수값들을 출력
		
		int temp = x; //temp변수를 새로 만들어 변수값을 변수x의 값으로 저장함. (변수 x의 값 변화는 없다.)
		//temp변수의 값 <= x의 값(3) temp == 3
		x = y; //변수 x의 값을 변수 y값으로 저장한다.
		//x의 값 <= y의 값(5) x == 5
		y = temp; //변수의 y의 값을 앞서 선언했던 temp변수값으로 저장한다.
		//y의 값 <= temp의 값(3) y == 3
		
		System.out.println("x : " + x + " y : " + y);
		
	}

}
