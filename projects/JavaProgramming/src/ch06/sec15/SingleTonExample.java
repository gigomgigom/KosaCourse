package ch06.sec15;

public class SingleTonExample {
	public static void main(String[] args) {
		//SingleTon st = new SingleTon();
		SingleTon st1 = SingleTon.getInstance();
	}
}
