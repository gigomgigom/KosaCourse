package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break; //이 break구문은 if구문이 아닌 while구문을 break하는 역할
			}
		}
		System.out.println("프로그램 종료");
	}
}
