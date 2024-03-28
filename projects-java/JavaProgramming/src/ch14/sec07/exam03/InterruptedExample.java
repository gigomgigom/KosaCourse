package ch14.sec07.exam03;

public class InterruptedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
	}

}
