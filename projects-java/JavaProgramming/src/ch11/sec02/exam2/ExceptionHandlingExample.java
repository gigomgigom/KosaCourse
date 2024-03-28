package ch11.sec02.exam2;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("해당 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당 클래스가 존재하지않습니다.");
		}
		
		
	}

}
