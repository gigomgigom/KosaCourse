package subject.subject2;

import java.util.Scanner;

public class Subject2First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Scanner에서 출력횟수를 입력
		int cnt = sc.nextInt();
		
		//입력받은 출력횟수만큼 반복
		for(int i = 0; i < cnt; i++) {
			System.out.println("Hello MyCompany");
		}
	}
}
