package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//필요한 변수 달리는 속도, 몇번 누르면 어떻게 행동할것인가, 플래그(뛸것인가 말것인가)
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1. SpeedUp | 2. SpeedDown | 3. Stop");
			System.out.println("-------------------------------");
			System.out.print("선택 : ");
			
			String strNum = scanner.nextLine(); //사용자가 데이터를 입력할때까지 대기한다.
			
			if(strNum.equals("1")) {
				System.out.println("증속합니다.");
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("2")) {
				System.out.println("감속합니다.");
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("3")) {
				System.out.println("중지합니다.");
				//break; break문으로 while루프를 탈출할수 있다.
				run = false; //상태플래그를 변경하여 
			}
		}
		
	}

}
