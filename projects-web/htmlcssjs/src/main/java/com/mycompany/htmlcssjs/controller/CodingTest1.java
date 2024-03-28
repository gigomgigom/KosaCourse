package com.mycompany.htmlcssjs.controller;

import java.util.Scanner;

public class CodingTest1 {
	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//Scanner에서 출력횟수를 입력
		int cnt = sc.nextInt();
		//입력받은 출력횟수만큼 반복
		for(int i = 0; i < cnt; i++) {
			System.out.println("Hello MyCompany");
		}
	}
}
