package ch12.sec03.exam05;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		
		m1.setId("user1");
		m1.setName("홍길동");
		m1.setAge(26);
		
		Member m2 = new Member();
		m2.setId("user1");
		m2.setName("홍길동");
		m2.setAge(26);
		
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode() == m2.hashCode());
		System.out.println(m1.toString());
	}

}
