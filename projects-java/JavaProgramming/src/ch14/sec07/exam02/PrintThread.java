package ch14.sec07.exam02;

public class PrintThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				System.out.println("실행 중입니다.");
				
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
		
		}
		
		System.out.println("리소스 정리 중입니다.");
		System.out.println("실행을 종료합니다.");
		
	}
}
