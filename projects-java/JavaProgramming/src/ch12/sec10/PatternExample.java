package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";
		String data = "010-2810-4870";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("일치합니다!");
		} else {
			System.out.println("불일치 합니다");
		}
		
		data = "tlarlrma@naver.com";
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("불일치합니다");
		}
	}

}
