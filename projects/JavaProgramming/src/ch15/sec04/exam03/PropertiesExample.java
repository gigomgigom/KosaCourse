package ch15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		try {
			//프로퍼티 파일 경로를 상대경로로 지정하였다. (기준 지금 작성하고 있는 이 코드의 .class파일이 존재하는 곳
			prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String userName = prop.getProperty("username"); //프로퍼티 파일에 적혀있는 유니코드 문자를 한글로 다시 변환해준다.
		String password = prop.getProperty("password");
		
		System.out.println(userName + " : " + password);
	}

}
