package ch14.sec03.exam02;

//작업객체
public class MusicTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			//쓰레드가 작업할 내용
			System.out.println("노래를 재생합니다.");
			
			//0.5초 일시정지
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
