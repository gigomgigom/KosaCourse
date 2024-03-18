package ch14.sec03.exam03;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 작업1---------------------------------------
		//Thread 클래스타입으로 상속받는 하위(작업)클래스를 불러온다.
		Thread thread = new MusicThread();
		//작업스레드 실행 시작
		thread.start();
		// 작업2---------------------------------------
		for(int i = 0; i < 5; i++) {
			System.out.println("가사를 출력합니다.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
