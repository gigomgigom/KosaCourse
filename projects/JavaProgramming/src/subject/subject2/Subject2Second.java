package subject.subject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Subject2Second {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력받은 숫자들을 ','를 기준으로 토큰으로 분리한다.
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		//입력받은 수들중에서 홀수들만 담을 ArrayList생성
		ArrayList<Integer> oddArr = new ArrayList<>();
		
		//총합, 최솟값
		int sum = 0;
		int min = 100;
		
		for(int i = 0; i < 7; i++) {
			//7번 반복하며 토큰의 값을 받아온다.
			int num = Integer.parseInt(st.nextToken());
			//받아온 토큰의 수가 홀수인지 여부
			boolean isOdd = ((num % 2)==1);
			//만약 홀수가 맞다면
			if(isOdd) {
				//oddArr에 홀수를 추가
				oddArr.add(num);
				//최솟값을 반복해서 대조한다.
				if(num < min) {
					min = num;
				}
			}
		}
		//만약 홀수가 없다면 -1 출력
		if(oddArr.isEmpty()) {
			System.out.println(-1);
		} else {
			//만약 홀수가 하나라도 있다면 총합과 최솟값을 출력한다.
			for(int num : oddArr) {
				sum += num;
			}
			
			System.out.println(sum);
			System.out.println(min);

		}
		
	}

}
