package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println(account.getBalance());
		try {
		account.withdraw(1000);
		System.out.println(account.getBalance());
		account.withdraw(10000);
		} catch(InsufficientException e) {
			System.out.println(e.getMessage());
		}

	}

}
