package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*20) + 81; //81 부터 100 사이의 난수를 받아 score변수에 대입한다.
		System.out.println("score: " + score);
		
		String grade; //선언만 했다. 초기화X
		
		if(score>=90) {
			if(score>=95) {
				grade = "A";
			}
			grade = "B";
		} else {
			if(score>=85) {
				grade = "C";
			} else {
				grade = "D";
			}
		}
		
		System.out.println("grade : " + grade);
	}

}
