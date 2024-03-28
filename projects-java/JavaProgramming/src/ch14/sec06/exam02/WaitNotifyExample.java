package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//공유 객체 생성
		WorkObject workObject = new WorkObject();
		
		//두개의 스레드를 생성할 때 공유 객체를 주입한다.
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		//두개의 스레드를 실행
		threadA.start();
		threadB.start();
		
	}

}
