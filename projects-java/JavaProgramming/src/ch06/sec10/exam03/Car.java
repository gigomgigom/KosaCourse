package ch06.sec10.exam03;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "로 달립니다.");
	}
	
	static void simulate() {
		Car car = new Car();
		car.speed = 100;
		car.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car car = new Car();
		car.speed = 60;
		car.run();
	}
}
