package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			char a = 'A';
			char b = 'B';
			writer.write(a);
			writer.write(b);
			char[] arr = { 'C', 'D', 'E' };
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
