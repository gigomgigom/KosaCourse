package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.tire = new Tire();
		car.run();
		car.tire = new HankookTire();
		car.run();
		car.tire = new KumhoTire();		
		car.run();
	}

}
