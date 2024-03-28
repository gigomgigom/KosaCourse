package ch11.sec06;

public class Account {
	private long balance;
	
	public void deposit(long amount) {
		balance += amount;
	}
	
	public void withdraw(long amount) throws InsufficientException{
		if(balance < amount) {
			throw new InsufficientException("잔고가 부족합니다 부족한 금액 : " + (amount-balance));
		}
		balance -= amount;
	}
	
	public long getBalance() {
		return balance;
	}
}
