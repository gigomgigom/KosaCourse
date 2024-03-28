package ch11.sec02.exam1;

public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 : " + result);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
	
		 try { 
			 
			 System.out.println("프로그램 시작");
		 
			 //Class.forName("  "); //A a = new A();
		 
			 String name = "뮤뮤"; int length = name.length();
		 
			 System.out.println("문자열의 길이: " + length);
		 
		 } catch(NullPointerException e) { 
			 
			 System.out.println(e + "예외가 발생하였습니다."); 
		 
		 } finally { 
			 
			 System.out.println("예외처리 마무리"); 
		 
		 }
		
		System.out.println("프로그램 종료");
	}

}
