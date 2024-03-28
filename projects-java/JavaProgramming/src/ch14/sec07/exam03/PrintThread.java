package ch14.sec07.exam03;

public class PrintThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(true) {
				System.out.println("실행 중입니다.");
				
				if(Thread.interrupted()) {
					break;
				}
				if(isInterrupted()) {
					break;
				}
			}
		System.out.println("리소스 정리 중입니다.");
		System.out.println("실행을 종료합니다.");
		
	}
}
