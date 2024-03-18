package ch14.sec03.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 작업1---------------------------------------
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				//쓰레드가 작업할 내용
				System.out.println("노래를 재생합니다.");
				
				//0.5초 일시정지
				try {
					Thread.sleep(500);
				} catch(Exception e) {
					e.printStackTrace();
				}				
			}
		});
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
