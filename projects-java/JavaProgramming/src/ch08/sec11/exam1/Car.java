package ch08.sec11.exam1;

public class Car {
	public Tire tire1 = new HankookTire();
	public Tire tire2 = new KumhoTire();
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
}
