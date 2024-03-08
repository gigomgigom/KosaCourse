package ch06.sec15;

public class BankExample {

	public static void main(String[] args) {
		Bank bank1 = new Bank("Seoul");
		bank1.deposit(10000);
		Bank bank2 = new Bank("Busan");
		bank2.withdraw(3000);
		
		bank1.balanceInfo();

	}

}
