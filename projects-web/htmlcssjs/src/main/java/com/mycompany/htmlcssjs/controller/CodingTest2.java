package com.mycompany.htmlcssjs.controller;

import java.util.Scanner;

public class CodingTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 홀수의 합계 변수
		int sum = 0;
		// 7개의 수를 담을 배열 생성
		int[] num = new int[7];
		// 최소값을 구하기 위한 변수
		int min = Integer.MAX_VALUE;
		// 연속된 7개의 숫자(문자열)를 입력받고 ','기준으로 숫자(문자열)들을 분리하여 배열에 저장한다. 
		String inputNum = sc.nextLine();
		String[] inputArr = inputNum.split(",");
		// 분리된 문자열타입의 숫자데이터들을 num배열에 정수형으로 변환하여저장한다. 
		for(int i = 0; i < inputArr.length; i++) {
			num[i] = Integer.parseInt(inputArr[i]);
		}
		// 배열의 길이만큼 반복
		for (int i = 0; i < num.length; i++) {
			// 입력받은 값이 홀수일 경우
			if (num[i] % 2 != 0) {
				// 홀수들의 총합을 구함
				sum += num[i];
				// 홀수의 수들 중 min의 값과 비교하여 최소값 구하기
				if (num[i] < min) {
					// 더 작은 값을 min에 저장
					min = num[i];
				}
			}
		}
		// 입력된 값들중에 홀수가 존재하지않으면
		if (sum == 0) {
			// -1을 출력
			System.out.println(-1);
		} else {
			// 홀수가 존재하면 총합과 최솟값을 출력한다. System.out.println(sum);
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
