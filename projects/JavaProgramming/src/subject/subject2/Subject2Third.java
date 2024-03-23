package subject.subject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Subject2Third {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		int multiResult = 1;
		
		for(int i = 0; i < 3; i++) {
			multiResult = multiResult * Integer.parseInt(st.nextToken());
		}
		int[] numCntArr = new int[10];
		
		 /* while (multiResult > 0) { 
		 * int digit = multiResult % 10; 
		 * numCntArr[digit]++;
		 * multiResult /= 10; 
		 * }
		 * 
		 * for (int i = 0; i < 10; i++) { 
		 * 	System.out.println(i + ": " + numCntArr[i]); 
		 * }
		 */
		

		String resultToString = String.valueOf(multiResult);
		
		for(int i = 0; i < resultToString.length(); i++) { 
			char digit = resultToString.charAt(i);
			int number = digit - 48; //숫자 ASCII코드는 48('0')부터 시작한다.
			numCntArr[number]++;
		}
		for (int i = 0; i < 10; i++) { 
			System.out.println(i + ": " + numCntArr[i]); 
		}
		
		
	}

}
