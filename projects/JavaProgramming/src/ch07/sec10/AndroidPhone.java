package ch07.sec10;

public class AndroidPhone extends MobilePhone{
	public String owner;
	
	public AndroidPhone(String owner) {
		super(owner);
	}
	//재정의한 internetSearch메서드를 주석처리를 해보면 
	public void internetSearch() {
		System.out.println("크롬 브라우저로 인터넷을 검색합니다.");
	}
}
