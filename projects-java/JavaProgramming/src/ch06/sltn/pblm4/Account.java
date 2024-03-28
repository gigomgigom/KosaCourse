package ch06.sltn.pblm4;

public class Account {
	
	private int balance; //잔액
	private String name; //계좌주
	private String accNum; //계좌번호
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	Account(int balance, String name, String accNum) { //객체 생성할때 객체 안의 필드값들을 초기화하는 생성자.
		this.name = name;
		this.accNum = accNum;
		if(balance <= MAX_BALANCE || MIN_BALANCE >= 0) {
			this.balance = balance;
		}
	}
	
	public int getBalance() { //선택한 객체(계좌)에 존재하는 잔액을 리턴
		return balance;
	}
	
	public void setBalance(int balance) { //선택한 객체(계좌)의 잔액 필드값을 수정한다.
		this.balance += balance;
	}

	public String getName() { //선택한 객체(계좌)에 존재하는 계좌주이름을 리턴.
		return name;
	}

	public String getAccNum() { //선택한 객체(계좌)에 존재하는 계좌번호를 리턴
		return accNum;
	}
	
	
	
	
}
