package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "자바";
		
		try {
			byte[] arr1 = data.getBytes("UTF-8");
			System.out.println("arr1: " + Arrays.toString(arr1));
			
			String recoveredData = new String(arr1, "UTF-8");
			System.out.println(recoveredData);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
