package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10, 20, 30};
		
		Computer myCom = new Computer();
		int result1 = myCom.sum1(arr1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3});
		System.out.println("result2 : " + result2);
		
		/*
		int result3 = myCom.sum1(1, 2, 3);
		System.out.println("result3 : " + result3);
		*/
		
		int result4 = myCom.sum2(arr1);
		System.out.println("result1 : " + result4);
		
		int result5 = myCom.sum2(new int[] {1, 2, 3});
		System.out.println("result2 : " + result5);
		
		int result6 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result6);
	}
}
