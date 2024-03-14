package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123"; //주민번호
		int length = ssn.length(); //주민번호의 길이 대입
		if(length == 13) { //주민번호가 13자리면
			System.out.println("정상적으로 입력한 주민번호입니다.");
		} else { //그 외라면
			System.out.println("비정상적으로 입력한 주민번호입니다. 자릿수가 맞질 않습니다.");
			System.out.println("입력한 자리수: " + length);
		}
	}

}
