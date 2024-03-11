package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed += 10;
	}
	
	//final로 정의된 메서드는 재정의될 수 없다.
	/*public void stop() {
		
	}*/
	
}
