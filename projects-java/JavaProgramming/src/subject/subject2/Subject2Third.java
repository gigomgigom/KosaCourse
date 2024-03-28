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
		
		//곱한 값을 저장할 multiResult변수 초기화
		int multiResult = 1;
		
		//입력받은 세 정수를 곱한다.
		for(int i = 0; i < 3; i++) {
			multiResult = multiResult * Integer.parseInt(st.nextToken());
		}
		//0~9까지 숫자들이 몇번씩 사용했는지 저장할 배열 생성
		int[] numCntArr = new int[10];
		
		 /* 
		 *만약 곱셈한 결과가 0보다 크다면(음수가 아니라면)
		 * while (multiResult > 0) { 
		 *맨 우측 자리에 들어가있는 수를 찾는다.
		 * int digit = multiResult % 10;
		 *그리고 그 수를 찾으면 해당하는 인덱스에 1씩(카운트) 증가한다. 
		 * numCntArr[digit]++;
		 *그리고 10을 나누고 다음 자리수를 찾을 수 있게 준비해준다.
		 * multiResult /= 10; 
		 * }
		 */
		
		//곱셈한 결과를 문자열로 변환한다.
		String resultToString = String.valueOf(multiResult);
		
		//0부터 문자열의 길이만큼 반복한다.
		for(int i = 0; i < resultToString.length(); i++) { 
			//charAt을 호출하여 i번째에 해당하는 문자를 반환받는다. 
			char digit = resultToString.charAt(i);
			//그리고 해당 문자를 int로 변환시킨다.
			int number = digit - 48; //숫자 ASCII코드는 48('0')부터 시작한다.
			//숫자에 해당하는 인덱스에 1씩(카운트)를 증가시킨다.
			numCntArr[number]++;
		}
		for (int i = 0; i < 10; i++) { 
			System.out.println(numCntArr[i]); 
		}
		
		
	}

}
