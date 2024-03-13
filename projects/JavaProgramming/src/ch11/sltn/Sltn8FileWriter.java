package ch11.sltn;

import java.io.IOException;

public class Sltn8FileWriter implements AutoCloseable {

	
	public Sltn8FileWriter (String filePath) throws IOException {
		System.out.println("open " + filePath);
	}
	
	public void write(String data) throws IOException {
		System.out.println(data + "를 파일에 저장합니다.");
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close the file");
	}

}
