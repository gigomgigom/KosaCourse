package ch06.sec15;

public class Bank {
	private String branch;
	
	public Bank(String branch) {
		this.branch = branch;
	}
	
	public void deposit(int amount) {
		Account account = Account.getInstance();
		account.input(amount);
	}
	public void withdraw(int amount) {
		Account account = Account.getInstance();
		account.output(amount);
	}
	public void balanceInfo() {
		Account account = Account.getInstance();
		System.out.println(account.getBalance());
	}
}
