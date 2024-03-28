package ch06.sec15;

public class SingleTon {
	
	private static SingleTon instance = new SingleTon();
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		return instance;
	}
}
