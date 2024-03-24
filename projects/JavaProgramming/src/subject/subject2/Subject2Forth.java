package subject.subject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subject2Forth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//문자열을 계속 수정해야하므로 StringBuilder를 활용할것이다.
		StringBuilder sb = new StringBuilder();
		
		//입력받은 비밀번호를 변수에 저장한다.
		String password = br.readLine();
		
		//비밀번호의 길이만큼 반복한다.
		for(int i = 0; i < password.length(); i++) {
			//i번째에 있는 문자를 추출한다.
			int getChar = password.charAt(i);
			
			//아스키 코드에서 4를 더한다.
			int changedChar = getChar + 4;
			//만약 changedChar에 맵핑된 문자가 'z'보다 뒷번호라면
			if(changedChar > 122) {
				//다시 'a'로부터 시작할 수 있도록 26을 빼준다.
				changedChar -= 26;
				//StringBuilder에 맵핑된 문자를 추가해준다.
				sb.append((char)changedChar);
			} else {
				//StringBuilder에 맵핑된 문자를 추가해준다.
				sb.append((char)changedChar);
			}
		}
		
		System.out.println(sb);
	}

}
