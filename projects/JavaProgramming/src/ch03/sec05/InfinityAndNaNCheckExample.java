package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 0;
		//double y = 0.0; 0인 y값의 타입을 변경해서 결과를 확인해보자 
		double z = x / y;
		//double z = x % y;
		
		//잘못된 코드
		System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z+2);
		}
		
	}

}
