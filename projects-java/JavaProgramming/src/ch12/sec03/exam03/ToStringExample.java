package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone("삼성전자", "안드로이드");
		
		String strObj = sp.toString();
		System.out.println(strObj);
		
		System.out.println(sp);
	}

}
