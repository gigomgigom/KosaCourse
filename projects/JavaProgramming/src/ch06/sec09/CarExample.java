package ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.company);
		Car.info();
		
		Car myCar = new Car("그랜저");
		myCar.setSpeed(100);
		
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		
		myCar.run();
	}

}
