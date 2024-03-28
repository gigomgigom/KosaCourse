package ch14.sec05.exam01;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) { //5번 반복되게함.
			System.out.println("띵소리가 납니다.");
			try {
				//2초동안 쉬도록 함.
				Thread.sleep(2000);
			} catch (InterruptedException e) { //예외 처리를 해줘야함
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
