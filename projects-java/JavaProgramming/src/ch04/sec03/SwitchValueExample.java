package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		
		//JAVA11 이전 문법
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		
		//Java 13부터 가능
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result;
				}
			default -> 60;
		}; //위 코드는 사실상 변수 대입 실행문이기 때문에 세미콜론은 꼭 붙어야한다.
		System.out.println("score2: " + score2);
	}

}
