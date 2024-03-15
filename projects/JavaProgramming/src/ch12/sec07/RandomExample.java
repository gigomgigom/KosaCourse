package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(3);
		int[] selectNum = new int[6];
		
		System.out.print("선택한 번호 : ");
		
		for(int i = 0; i < selectNum.length; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			System.out.print(selectNum[i] + " ");
		}
		
		System.out.println();
		
		Random random1 = new Random(5);
		int[] winningNum = new int[6];
		
		System.out.print("당첨 번호는 ");
		
		for(int i = 0; i < winningNum.length; i++) {
			winningNum[i] = random1.nextInt(45) + 1;
			System.out.print(winningNum[i] + " ");
		}
		
		System.out.println();
		
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		
		boolean result = Arrays.equals(selectNum, winningNum);
		
		if(result) {
			System.out.println("축하드립니다. 당첨되셨어요");
		} else {
			System.out.println("깨비");
		}
	}

}
