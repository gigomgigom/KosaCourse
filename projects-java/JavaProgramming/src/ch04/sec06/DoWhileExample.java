package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputData;
		
		do {
			inputData = scanner.nextLine();
			System.out.println("> " + inputData);
		} while (!inputData.equals("q"));
		
		System.out.println("\n프로그램 종료");
	}

}