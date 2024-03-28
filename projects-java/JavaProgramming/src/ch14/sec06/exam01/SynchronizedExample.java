package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//공유 객체 생성
		Calculator calculator = new Calculator();
		
		//공유 객체를 User1Thread에 세팅
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		
		//공유 객체를 User2Thread에 주입
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		
		//User1Thread가 계산기를 먼저 사용
		user1Thread.start();
		//User2Thread가 계산기를 나중에 사용
		user2Thread.start();
	}

}
