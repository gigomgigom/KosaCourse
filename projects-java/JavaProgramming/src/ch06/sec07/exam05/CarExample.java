package ch06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("avante");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println("------------");
		Car car2 = new Car("sonata", "grey");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println("------------");
		Car car3 = new Car("grandeur", "black", 300);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
	}

}
