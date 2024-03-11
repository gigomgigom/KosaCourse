package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
		Bus bus = new Bus();
		driver.drive(bus);
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		System.out.println("new 연산자를 통해 생성된 객체를 매개값으로 넣는다면?");
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
