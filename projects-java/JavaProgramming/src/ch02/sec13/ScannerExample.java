package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
		//입력 객체 선언이다. (나중에 다룰것이니 그냥 이런코드가 있다 생각하고 넘어가자)
		
		//1번 예제
		/*
		String input = scanner.nextLine(); //입력받은 문자열을 input변수에 저장한다.
		System.out.println("입력한 내용 : " + input); //input변수값을 콘솔창에 출력한다.
		*/
		
		//2번예제
		/*
		while(true) { //while구문은 괄호안에 bool값이 참일경우 무한정 while블럭안의 명령어들이 반복해서 돌아간다.
			System.out.print("넌 못지나간다."); 
			String strX = scanner.nextLine(); //입력값을 문자열타입인 strX변수에 저장한다.
			int x = Integer.parseInt(strX); //strX변수값인 문자열을 정수형으로 변환한다.
			
			System.out.print("넌 못지나간다.");
			String strY = scanner.nextLine();
			int y = Integer.parseInt(strY);
			
			int result = x + y;
			
			System.out.println("x + y: " + result);
		}
		*/
		
		//3번 예제
		//자 이제 조건문을 넣어서 이 무한굴레에서 탈출해보도록하자
		while(true) {
			System.out.print("비밀번호를 입력하세요. : ");
			String data = scanner.nextLine();
			
			if(data.equals("강된장두부현미밥!")) { //만약 data변수값(입력한 값)이 "q"와 일치하다면
				break;
			}
			
			System.out.println("비밀번호가 틀립니다. 당신이 입력한 비밀번호 : " + data);
			System.out.println();
			
		}
		
		System.out.println("탈출!!");

	}

}
