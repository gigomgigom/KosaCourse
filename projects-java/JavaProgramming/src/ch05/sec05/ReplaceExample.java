package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); // 자바 -> JAVA로 대체 (대체되어서 새로운 문자열 객체가 생성된다.)
		
		System.out.println("oldStr : " + oldStr); 
		System.out.println("newStr : " + newStr);
	}

}
