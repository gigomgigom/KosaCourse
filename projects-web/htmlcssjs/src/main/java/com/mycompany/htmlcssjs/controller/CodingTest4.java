package com.mycompany.htmlcssjs.controller;

import java.util.Scanner;

public class CodingTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로 입력받은 문자열 저장
		String str = sc.nextLine();
		// 문자열에서 추출한 문자를 저장할 변수
		char c = 0;
		// 사용자로 입력받은 문자열의 길이만큼 반복
		for (int i = 0; i < str.length(); i++) {
			// 사용자로 입력받은 문자열에서 인덱스 i에 해당하는 문자를 c에 저장
			c = str.charAt(i);
			// 해당 인덱스 문자에서 4를 증가시킴
			c += 4;
			// c(z의 아스키코드 (122)보다 c의 아스키코드 값이 클 시
			if (c > 'z') {
				// c의 아스키코드 값을 26을 뺌
				c -= 26;
			}
			// 결과를 출력
			System.out.print(c);
		}
	}
}