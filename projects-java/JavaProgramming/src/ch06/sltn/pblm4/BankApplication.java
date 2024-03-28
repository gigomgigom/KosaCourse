package ch06.sltn.pblm4;

import java.util.Scanner;

public class BankApplication {
	
	Scanner sc = new Scanner(System.in); //키보드 입력을 위한 Scanner 객체 생성
	Account[] account = new Account[100]; //Account 객체를 담을 수 있는 account 배열객체를 생성하고 길이를 100으로 지정한다.
	int createIndex = 0; //계좌를 생성할때 배열의 몇번째에 생성할지 지정하는 인덱스를 구하는 값
	boolean loopflag = true; //은행 앱의 작동유무를 정하는 boolean값
	
	
	//은행 앱의 전체적인 기능(메소드)들을 통제하는 메소드
	public void bankManager() {
		while(loopflag) { //loopflag가 false로 바뀔때까지(5번선택) 계속해서 반복한다.
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택 : ");
			String menuNum = sc.nextLine(); //메뉴번호 입력받는다.
			
			switch(menuNum) { //switch문으로 입력받은 메뉴번호에 해당하는 기능(메소드)를 호출해준다.
				case "1":
					System.out.println("-----------");
					System.out.println("계좌 생성");
					System.out.println("-----------");
					createAcc(); //계좌생성 메소드 호출
					break;
				case "2":
					System.out.println("-----------");
					System.out.println("계좌 목록");
					System.out.println("-----------");
					showAcc(); //계좌목록조회 메소드 호출
					break;
				case "3":
					System.out.println("-----------");
					System.out.println("예금");
					System.out.println("-----------");
					deposit(); //예금 메소드 호출
					break;
				case "4":
					System.out.println("-----------");
					System.out.println("출금");
					System.out.println("-----------");
					withdraw(); //출금 메소드 호출
					break;
				case "5":
					terminate(); //종료 메소드 호출
					break;
				default:
					System.out.println("잘못된 입력정보입니다."); //범위밖인 값이 입력되었다면
					break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	public void createAcc() { //계좌생성기능
		//계좌(객체)를 생성할 때 정보(필드)값들을 입력받는 과정
		String accNum;
		String name;
		int balance;
		System.out.print("계좌번호: ");
		accNum = sc.nextLine();
		if(checkAccNum(accNum)) {
			System.out.print("계좌주: ");
			name = sc.nextLine();
			System.out.print("초기입금액: ");
			balance = Integer.parseInt(sc.nextLine());
			if(balance >= 0 || balance <= 1000000) {
				//계좌(객체)를 생성함과 동시에 정보(필드)값들을 초기화하는 과정
				Account acc = new Account(balance, name, accNum);
				//배열의 createIndex(초기값 0)번째에 계좌(객체)를 집어넣는다.
				account[createIndex] = acc;
				System.out.println("\n결과: 계좌가 생성되었습니다.");
				//배열의 다음순서에도 생성을 할 수 있도록 createIndex변수의 값을 1증가시킨다.
				createIndex++;
			} else {
				System.out.println("입금액이 가능범위를 초과하였습니다.");
			}
		} else {
			System.out.println("이미 존재하는 계좌번호입니다.");
		}
	}
	
	//계좌번호 존재여부 파악
	public boolean checkAccNum(String accNum) {
		boolean flag = true;
		for(int i = 0; i < account.length; i++) {
			if(account[i] != null) {
				if(account[i].getAccNum().equals(accNum)) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	//계좌목록 조회기능
	public void showAcc() {
		//account배열에서 존재하는 계좌(객체)의 정보들을 출력한다.
		for(int i = 0; i < account.length; i++) {
			if(account[i] != null) {
				//account배열의 i번째 인덱스에 존재하는 계좌(객체)의 정보들을 getter메소드를 통해 받아온다.
				System.out.printf(account[i].getAccNum() + "\t" + account[i].getName() + "\t" + account[i].getBalance() + "\n");
			}
		}
	}
	//입금기능
	public void deposit() {
		String inputAccNum; //입력받은 계좌번호를 저장할 변수
		int depositAmount; //입력받은 입금액을 저장할 변수
		System.out.print("계좌번호 : ");
		inputAccNum = sc.nextLine(); //inputAccNum에 입력값을 저장
		for(int i = 0; i < account.length; i++) {
			if(account[i] != null) { //account배열안에 존재하는 계좌(객체)들 중에서
				if(account[i].getAccNum().equals(inputAccNum)) { //계좌(객체)안의 계좌번호(필드)가 inputAccNum과 일치하면
					System.out.print("입금액: ");
					depositAmount = Integer.parseInt(sc.nextLine());
					if(depositAmount >= 0) {
						int settedBalance = account[i].getBalance() + depositAmount;
						if(settedBalance <= 1000000) {
							account[i].setBalance(depositAmount);//해당 계좌(객체)안의 잔액(필드)를 설정한다.
							break;
						} else {
							System.out.printf("입금한도를 초과하였습니다.현재 %s님이 보유하고있는 잔액 : %d\n", account[i].getName(), account[i].getBalance());
							break;
						}
					} else {
						System.out.println("음수값을 입력하실 수 없습니다.");
						break;
					}
				}
			} else {
				System.out.println("존재하지않는 계좌번호입니다.");
				break;
			}
		}
	}
	
	//출금기능
	public void withdraw() {
		String inputAccNum;//입력받은 계좌번호를 저장할 변수
		int withdrawAmount;//입력받은 출금액을 저장할 변수
		System.out.print("계좌번호 : ");
		inputAccNum = sc.nextLine(); //inputAccNum에 입력값을 저장
		for(int i = 0; i < account.length; i++) {
			if(account[i] != null) { //account배열안에 존재하는 계좌(객체)들 중에서
				if(account[i].getAccNum().equals(inputAccNum)) { //계좌(객체)안의 계좌번호(필드)가 inputAccNum과 일치하다면
					System.out.print("출금액: ");
					withdrawAmount = Integer.parseInt(sc.nextLine());
					if(withdrawAmount >= 0) {
						if(account[i].getBalance() >= withdrawAmount) {
							//해당 계좌(객체)안의 잔액(필드)를 설정한다.
							account[i].setBalance(-withdrawAmount);//출금액으로 입력받은 값에 부호를 음수로 바꾼다.
							//왜 바꿨느냐 물으신다면...Account클래스에서 setBalance()메소드를 확인해보도록.
							break;
						} else {
							System.out.printf("잔액이 부족합니다. 현재 %s님이 보유하고있는 잔액 : %d\n", account[i].getName(), account[i].getBalance());
							break;
						}
					} else {
						System.out.println("음수값을 입력하실 수 없습니다.");
						break;
					}
				}
			} else {
				System.out.println("존재하지않는 계좌번호입니다.");
				break;
			}
		}
	}
	
	//종료
	public void terminate() {
		//반복문 탈출을 위해 while문에 사용하는 조건식을 false로 변경한다.
		loopflag = false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankApplication 클래스의 객체를 생성하고
		BankApplication bank = new BankApplication();
		//bankManager메소드를 호출한다.
		bank.bankManager();
	}

}
