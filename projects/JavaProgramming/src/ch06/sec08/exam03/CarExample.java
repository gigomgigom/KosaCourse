package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Car myCar = new Car();
		
		//메소드 호출
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println("gas를 주입하세요");
	}

}
