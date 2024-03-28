package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); //6번째 인덱스에 해당하는 숫자를 char타입의 sex변수에 대입한다.
		switch (sex) { //sex변수가 갖는 값이
			case '1': //1 또는 3일 경우
			case '3':
				System.out.println("male"); //남자다.
				break;
			case '2': //2 또는 4일 경우
			case '4':
				System.out.println("female"); //여자다.
				break;
		}
	}

}
