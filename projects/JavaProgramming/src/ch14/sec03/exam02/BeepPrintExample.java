package ch14.sec03.exam02;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 작업1---------------------------------------
		//Runnable 인터페이스 타입으로 구현이 되어있는 업무 클래스를 불러온다.
		Runnable runnable = new MusicTask();
		//불러온 인터페이스 타입 변수를 통해 Thread 객체를 만들어낸다.
		Thread thread = new Thread(runnable);
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
