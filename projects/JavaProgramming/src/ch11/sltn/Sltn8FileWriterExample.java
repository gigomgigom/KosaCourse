package ch11.sltn;

import java.io.IOException;

public class Sltn8FileWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Sltn8FileWriter fw = null;
		 * 
		 * fw = new Sltn8FileWriter("file.txt");
		 */
		try(Sltn8FileWriter fw = new Sltn8FileWriter("file.txt")) {
			fw.write("Java");
		} catch(IOException e) {
			System.out.println("예외 발생했습니다.");
		}
	}

}
