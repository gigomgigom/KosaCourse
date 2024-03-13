package ch11.sec05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException 
				e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void method() throws IOException, FileNotFoundException {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/Temp/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		fis.read();
	}

}
