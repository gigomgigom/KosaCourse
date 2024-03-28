package ch18.sec11;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {

	public static void main(String[] args) {
		
		try {
			//데이터 입력
			String data = "" + "id : Sim\n" + "email: tlarlrma@naver.com\n" + "tel: 010-2810-4870";
			//Path 객체 생성
			Path path = Paths.get("C:/Temp/user.txt");
			//파일 생성 후 내용 입력
			Files.writeString(path, data, Charset.forName("UTF-8"));
			//파일에 대한 정보를 가져오고 출력
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + "byte");
			//
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		} catch(IOException e) {
			
		}
	}
}
