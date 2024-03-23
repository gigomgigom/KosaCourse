package sltn.mysubject;

import java.util.ArrayList;

public class AccountManager {
	
	private static AccountManager accountManager = new AccountManager();
	private ArrayList<Member> accountArr = new ArrayList<>();
	
	private AccountManager() {}
	
	public static AccountManager getInstance() {
		return accountManager;
	}
	
	public void createAccount(String id, String password, String name) {
		accountArr.add(new Member(id, password, name));
	}
	
	public void printAccount() {
		for(Member member : accountArr) {
			System.out.println("ID : " + member.getId());
			System.out.println("PW : " + member.getPassword());
			System.out.println("Name : " + member.getName());
			System.out.println("----------------");
		}
	}
}
