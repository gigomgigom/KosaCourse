package ch04.sltn;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		boolean flag = true; //껐다 켰다 스위치역할
		int balance = 0; // 잔고
		String input; //입력받을 문자열
		
		
		
		while(flag) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금, 2. 출금, 3. 잔고, 4. 종료");
			System.out.println("--------------------------------");
			
			System.out.print("번호 입력: ");
			
			String num = sc.nextLine();//메뉴번호 입력값 변수
			
			
			if(num.equals("1")) {
				
				System.out.print("예금액 >");
				input = sc.nextLine();
				balance += Integer.parseInt(input);
				System.out.println(balance);
				
			} else if(num.equals("2")) {
				
				System.out.print("출금액 >");
				input = sc.nextLine();
				if(balance < Integer.parseInt(input)) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= Integer.parseInt(input);
					System.out.println(balance);
				}				
			} else if(num.equals("3")) {
				
				System.out.println(balance);
				
			} else if(num.equals("4")) {
				
				System.out.println("프로그램 종료");
				//break;
				flag = false;
			}
		}
	}

}
