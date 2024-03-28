package sltn.study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		double avg;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		int testCaseCnt = Integer.parseInt(sc.nextLine());
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		arr.sort(Comparator.reverseOrder());
		
		max = arr.get(0);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		for(int i = 0; i < arr.size(); i++) {
			int score = arr.get(i);
			score = score/max*100;
			arr.set(i, score);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		
		avg = sum / arr.size();
		
		System.out.println(avg);
	}

}
