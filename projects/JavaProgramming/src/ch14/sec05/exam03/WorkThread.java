package ch14.sec05.exam03;

public class WorkThread extends Thread {
	public boolean work = true;
	
	public WorkThread(String name) {
		//스레드 이름 설정
		setName(name);
	}
	
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리중");
			} else {
				Thread.yield();
			}
		}
	}
}
