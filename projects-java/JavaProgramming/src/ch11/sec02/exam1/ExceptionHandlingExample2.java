package ch11.sec02.exam1;

public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch(NullPointerException e) {
			System.out.println("문자열이 존재하지않습니다.");
			System.out.println(e.getMessage()); //예외 발생 사유
			System.out.println();
			System.out.println(e.toString()); //어떤 예외가 발생했는지까지 상세히 표현한다.
			System.out.println();
			e.printStackTrace(); //예외발생 위치까지 나온다.
		} finally {
			System.out.println("메소드 종료");
		}

	}
	
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		printLength("12345");
		printLength(null);
		
		System.out.println("프로그램 종료");
	}

}
