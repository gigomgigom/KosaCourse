package ch07.sec10;

public class Iphone extends MobilePhone{
	public String owner;
	
	public Iphone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("사파리 브라우저로 인터넷을 검색합니다.");
	}
}
