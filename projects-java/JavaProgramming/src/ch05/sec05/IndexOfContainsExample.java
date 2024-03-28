package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //"프로그래밍" 문자열이 시작하는 위치(인덱스)를 찾는다.
		System.out.println(location); //인덱스 출력
		String subString = subject.substring(location); //해당 인덱스 이후 끝까지 문자열을 잘라내어 subString 변수에 저장한다.
		System.out.println(subString); //subString 문자열 출력
		
		location = subject.indexOf("자바"); //"자바"의 인덱스 위치를 출력한다.
		if(location != -1) { //만약 "자바"가 문자열 내에 존재할 경우
			System.out.println("자바와 관련된 책이군요."); 
		} else { //그 외에
			System.out.println("자바와 관련없는 책이네용");
		}
		
		boolean result = subject.contains("자바"); //"자바"가 subject 문자열 내에 포함되어있나의 결과를 result에 대입
		if(result) { //참이라면
			System.out.println("자바와 관련된 책이군요.");
		} else {	//거짓이라면
			System.out.println("자바와 관련없는 책이군요");
		}
	}

}
