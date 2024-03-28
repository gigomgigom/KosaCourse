package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "홍길동&이수홍,박연수";
		String[] result = data.split("&|,");
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		String data1 = "심영조/시맹조/심앵조";
		StringTokenizer st = new StringTokenizer(data1, "/");
		
		while(st.hasMoreTokens()) {
			String result2 = st.nextToken();
			System.out.println(result2);
		}
	}

}
