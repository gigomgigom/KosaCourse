package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,심영조"; // 쉼표(,)를 통해 구분되어진 문자열들을 이어놓은 문자열 생성
		
		String[] tokens = board.split(","); //쉼표를 기준으로 문자열을 나눈다. 나눈 문자열들은 문자열 배열에 대입한다.
		
		System.out.println("번호 : " + tokens[0]); 
		System.out.println("제목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);
		
		System.out.println();
		
		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
	}

}
