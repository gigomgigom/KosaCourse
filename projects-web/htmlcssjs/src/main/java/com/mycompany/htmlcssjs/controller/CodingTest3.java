package com.mycompany.htmlcssjs.controller;

import java.util.Scanner;

public class CodingTest3 {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		//입력받은 문자열을 input변수에 저장한다.
		String input = sc.nextLine();
		//문자열을 ','를 기준으로 분리하고 분리된 문자열들을 numStr배열에 저장한다.
		String[] numStr = input.split(",");
		//int형 데이터를 저장할 수 있는 배열을 생성한다.(크기는 3으로 지정한다.)
		//numStr의 문자열 데이터를 정수형 데이터로 변환시켜 저장할 용도로 만들었다.
		int[] numArr = new int[3];
		//0~9까지 숫자가 각각 몇번 사용되었는지 연산할때 활용될 count변수 생성/초기화
		int count = 0;
		//numStr의 문자열 데이터를 기본타입으로 변환하여 numArr배열에 저장한다.
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(numStr[i]);
		}
		//numArr안에 저장된 세 정수들을 곱한 결과를 result변수에 대입한다.
		int result = numArr[0] * numArr[1] * numArr[2];
		//result변수에 담긴 숫자를 문자열로 변환한다.
		String resultStr = String.valueOf(result);
		
		//값(0~9) 9개와 resultStr각 자리수를 반복적으로 대조할것이다.
		for (int i = 0; i < 10; i++) {
			//i와 대조할 문자열의 각 자리수를 반복적으로 대조한다.
			for (int j = 0; j < resultStr.length(); j++) {
				//문자열에 j번째에 존재하는 글자를 resultCr 변수에 대입한다.
				char resultCr = resultStr.charAt(j);
				//문자 'i'에 매핑된 정수로 맞춰주고 그 값을 resultCr과 비교한다.
				//만약 서로 같은 값을 갖는다면
				if (i + '0' == resultCr) {
					//카운트를 1씩 증가한다.
					count++;
				}

			}
			//대조 작업이 전부 끝났을때 count의 최종값을 출력한다. 순서는(0~9)
			System.out.println(count);
			//count의 값을 다시 0으로 맞춰준다.
			count = 0;
		}

	}


}
