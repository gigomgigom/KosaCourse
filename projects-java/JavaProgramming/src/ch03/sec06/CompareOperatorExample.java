package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10; //num1 변수 선언 & 초기화
		int num2 = 10; //num2 변수 선언 & 초기화
		boolean result1 = (num1 == num2); //num1과 num2 변수의 값이 서로 같은가
		boolean result2 = (num1 != num2); //num1과 num2 변수의 값이 서로 다른가
		boolean result3 = (num1 <= num2); //num1의 값이 num2의 값보다 작거나 같은가
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		
		char char1 = 'A'; //65에 매핑
		char char2 = 'B'; //66에 매핑
		boolean result4 = (char1<char2); //char1의 정수값이 char2의 정수값보다 작은가
		System.out.println("result4: "+result4);
		
		int num3 = 1; //정수형 num3 변수 선언 & 초기화
		double num4 = 1.0; //실수형 num4 변수 선언 & 초기화
		boolean result5 = (num3 == num4); //num3의 값과 num4의 값이 서로 같은가?
		System.out.println("result5: "+result5);
		
		float num5 = 0.1f; //float 타입 num5 변수 선언 & 초기화
		double num6 = 0.1; //double 타입 num6 변수 선언 & 초기화
		boolean result6 = (num5 == num6); //float타입과 double타입 변수의 값이 서로 같은가
		boolean result7 = (num5 == (float)num6); 
		//float타입과 double타입에서 float타입으로 강제변환한 변수와 값이 같은가?
		
		System.out.println("result6: "+result6); //false가 나온 이유?
		//부동소수점 방식을 사용하는 실수형 타입들은 서로 정밀도의 차이가 있기때문에 값이 같다고 나오질 않는다.
		System.out.println("result7: "+result7); //다만 double타입을 float타입으로 강제변환시키면 같은 값이 나오게 된다.
		
		String str1 = "자바"; //문자열 타입 str1변수 선언 & 초기화
		String str2 = "Java"; // 문자열 타입 str2변수 선언 & 초기화
		boolean result8 = (str1.equals(str2)); //str1과 str2의 값이 서로 같은가?
		boolean result9 = (! str1.equals(str2)); //str1과 str2의 값이 서로 다른가?
		System.out.println("result8: "+result8);
		System.out.println("result9: "+result9);

	}

}
