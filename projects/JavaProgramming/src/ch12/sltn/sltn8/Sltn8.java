package ch12.sltn.sltn8;

public class Sltn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		int[] scores = new int[1000];
		for(int i = 0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long endTime = System.nanoTime();
		
		long duration = endTime - startTime;
		
		double durtToSec = duration / 1000000000;
		
		System.out.println(duration + "나노초가 소요되었습니다.");
	}

}
