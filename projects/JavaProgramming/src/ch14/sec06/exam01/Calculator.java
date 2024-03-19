package ch14.sec06.exam01;

public class Calculator {
	//Field 
	private int memory;
	//Constructor
	
	//Method
	public int getMemory() {
		return this.memory;
	}

	
	/* 동기화 메소드
	 * public synchronized void setMemory(int memory) { 
	 * 	this.memory = memory; 
	 * 	try {
	 * 		Thread.sleep(2000); 
	 * 	} catch (InterruptedException e) { // TODO Auto-generated
	 * 		catch block e.printStackTrace();
	 *  }
	 * 	System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	 *  }
	 */
	
	// 동기화 블럭
	public void setMemory(int memory) {
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
