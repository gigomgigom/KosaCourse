package ch14.sec06.exam01;

public class User1Thread extends Thread{
	//Field
	private Calculator calculator;
	//Constructor
	public User1Thread() {
		setName("User1Thread");
	}
	//Method 
	//setter주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculator.setMemory(100);
	}
}