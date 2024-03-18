package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkThread workThreadA = new WorkThread("workThreadA");
		
		WorkThread workThreadB = new WorkThread("workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		workThreadA.work = false;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		workThreadB.work = true;
		
		
	}

}
