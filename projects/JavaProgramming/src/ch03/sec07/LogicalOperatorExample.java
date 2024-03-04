package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언문에 있는 주석을 요리조리 옮겨보면서 결과값을 확인해보자
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if((65<=charCode)&&(charCode<=90)) { //변수값이 65 이상 그리고 90 이하일 경우
			System.out.println("대문자이군요.");
		}
		
		if( (97<=charCode) && (charCode<=122) ) { //변수값이 97 이상 그리고 122 이하일 경우
			System.out.println("소문자이군요.");
		}
		
		if((48<=charCode) && (charCode<=57)) { //변수값이 48 이상 그리고 57 이하일 경우
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 6;
		
		if( (value%2==0) || (value%3==0)) { //변수값을 2를 나눈 나머지값이 0이 되거나 또는 3을 나눈 나머지값이 0이 되면 if블럭 내 코드 실행
			System.out.println("2또는 3의 배수이군요.");
		}
		
		boolean result = (value%2==0) || (value%3==0); //위 if문에 사용했던 조건식에 대한 결과를 result변수에 대입
		if(!result) { //변수앞에 !를 붙여 값을 바꿨다.
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}
