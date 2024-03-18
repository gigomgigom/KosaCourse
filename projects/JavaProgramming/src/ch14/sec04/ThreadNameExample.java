package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 사용중인 스레드의 정보를 담는다.
		Thread mainThread = Thread.currentThread();
		//mainThread의 이름을 출력
		System.out.println(mainThread.getName() + "실행");
		
		//3번 연속 새로운 Thread를 생성한다.
		for(int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//생성된 Thread의 정보를 출력.
					System.out.println(getName() + "실행");
				}
			};
			threadA.start();
		}
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(getName() + "실행");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start();
	}

}
