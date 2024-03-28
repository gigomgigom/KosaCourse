package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		try {
			write("심영조가 문자 변환 스트림을 사용합니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void write(String str) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8"); //이름 그대로 OutputStream을 Writer로 변경한다.
		
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
	
	public static String read() throws Exception{
		
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8"); //이름 그대로 InputStream을 Reader로 변경한다.
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data, 0, num);
		return str;
		
	}

}
