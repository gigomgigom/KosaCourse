package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Korean k1 = new Korean("박자바", "123456-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("감자바", "123456-9934567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
