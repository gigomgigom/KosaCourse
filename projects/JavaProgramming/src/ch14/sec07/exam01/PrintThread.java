package ch14.sec07.exam01;

public class PrintThread extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!stop) {
			System.out.println("프로그램실행중입니다.");
		}
		System.out.println("리소스를 정리중입니다.");
		System.out.println("프로그램을 종료합니다.");
	}
}
