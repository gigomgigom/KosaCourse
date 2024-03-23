package subject.subject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subject2Forth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String password = br.readLine();
		
		for(int i = 0; i < password.length(); i++) {
			int getChar = password.charAt(i);
			
			int changedChar = getChar + 4;
			if(changedChar > 122) {
				changedChar -= 26;
				sb.append((char)changedChar);
			} else {
				sb.append((char)changedChar);
			}
		}
		
		System.out.println(sb);
	}

}
