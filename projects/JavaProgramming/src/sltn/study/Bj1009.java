package sltn.study;

import java.util.Scanner;

public class Bj1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testCaseCnt = Integer.parseInt(sc.nextLine());
		
		int[]dataCnt = new int[testCaseCnt];
		
		int[][] firstDigit = new int[10][4];
		
		for(int i = 0; i < firstDigit.length; i++) {
			for(int j = 0; j < firstDigit[i].length; j++) {
				if(i == 0) { //1
					firstDigit[i][0] = 1;
					firstDigit[i][1] = 1;
					firstDigit[i][2] = 1;
					firstDigit[i][3] = 1;
				} else if(i == 1) { //2
					firstDigit[i][0] = 2;
					firstDigit[i][1] = 4;
					firstDigit[i][2] = 8;
					firstDigit[i][3] = 6;
				} else  if(i == 2) {
					firstDigit[i][0] = 3;
					firstDigit[i][1] = 9;
					firstDigit[i][2] = 7;
					firstDigit[i][3] = 1;
				} else if(i == 3) {
					firstDigit[i][0] = 4;
					firstDigit[i][1] = 6;
					firstDigit[i][2] = 4;
					firstDigit[i][3] = 6;
				} else if(i == 4) {
					firstDigit[i][0] = 1;
					firstDigit[i][1] = 1;
					firstDigit[i][2] = 1;
					firstDigit[i][3] = 1;
				}
			}
		}
		
		for(int i = 0; i < dataCnt.length; i++ ) {
			
			int firstDigitLoop;
			String input = sc.nextLine();
			String[] num = input.split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			
			System.out.println(a + " " + b);
			
			if(a == 2 || a == 3 || a == 4 || a == 7 || a == 8 || a == 9) {
				if(b%4 == 0) {
					firstDigitLoop = 4;
				} else {
					firstDigitLoop = b%4;
				}
			} else {
				firstDigitLoop = 1;
			}
			
		}
	}

}
