package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "" + 10;
		String str4 = "" + 3.14;
		
		System.out.println(str3);
		System.out.println(str4);
	}

}
