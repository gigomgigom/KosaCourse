package ch06.sec08.exam03;

public class Car {
	//Field 선언
	int gas;
	//Constructor 선언
	
	//Method 선언
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("Not enough gas");
			return false;
		} else {
			System.out.println("Car has enough gas");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas+")");
				gas--;
			} else {
				System.out.println("멈춥니다.");
				break;
			}
		}
		System.out.println("run메소드 실행 종료");
	}
}
