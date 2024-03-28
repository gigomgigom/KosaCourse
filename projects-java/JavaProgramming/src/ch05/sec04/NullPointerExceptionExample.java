package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = null; //배열참조타입 intArray변수를 선언하며 null값으로 초기화를 한다.
		//int[] intArray = new int{1, 2}; //정상실행되게 바꾼 코드
		
		//intArray[0] = 10; //NullPointerException 예외 발생
		
		String str = null; //문자열참조타입 str변수를 선언하며 null값으로 초기화를 한다.
		//String str = "심영조"; //정상실행되게 바꾼 코드
		
		System.out.println("총 문자 수 : " + str.length()); //NullPointerException 예외 발생
	}

}
