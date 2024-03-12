package ch08.sec11.exam2;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Vehicle vehicle = new Bus();
		driver.drive(vehicle);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
