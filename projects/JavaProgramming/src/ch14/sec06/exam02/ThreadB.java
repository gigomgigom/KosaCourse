package ch14.sec06.exam02;

public class ThreadB extends Thread{
	private WorkObject workObject;
	
	//생성자 주입
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10000; i++) {
			workObject.methodB();
		}
	}
}
