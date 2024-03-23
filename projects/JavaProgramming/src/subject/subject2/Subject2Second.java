package subject.subject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Subject2Second {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		ArrayList<Integer> oddArr = new ArrayList<>();
		int sum = 0;
		int min = 100;
		
		for(int i = 0; i < 7; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			boolean isOdd = ((num % 2)==1);
			
			if(isOdd) {
				oddArr.add(num);
				
				if(num < min) {
					min = num;
				}
			}
		}
		
		if(oddArr.isEmpty()) {
			System.out.println(-1);
		} else {
			for(int num : oddArr) {
				sum += num;
			}
			
			System.out.println(sum);
			System.out.println(min);

		}
		
	}

}
