package sltn.mysubject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//메소드1 호출 (AccountManager 객체 받기)
		AccountManager accountManager = AccountManager.getInstance();
		
		//Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		//생성할 계정의 수를 입력받는다.
		System.out.print("생성할 계정의 수를 입력하세요 > ");
		int accountCnt = Integer.parseInt(sc.nextLine());
		
		//입력한 수만큼 반복해서 계정을 만든다.
		for(int i = 0; i<accountCnt; i++) {
			System.out.println("계정 생성--------");
			System.out.print("ID > ");
			String id = sc.nextLine();
			System.out.print("PW > ");
			String pw = sc.nextLine();
			System.out.print("name > ");
			String name = sc.nextLine();
			
			//메소드2 호출 (계정 생성)
			accountManager.createAccount(id, pw, name);
			
			System.out.println("계정 생성 완료");
		}
		
		//메소드3 호출 (생성된 계정 출력)
		accountManager.printAccount();
		
	}

}


