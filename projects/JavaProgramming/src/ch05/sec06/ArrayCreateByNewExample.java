package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수
		int[] arr1 = new int[3];
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr1 default value : " + arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr1 changed value : " + arr1[i]);
		}
		//실수
		double[] arr2 = new double[3];
		for(int i = 0; i<arr2.length; i++) {
			System.out.println("arr2 default value : " + arr2[i]);
		}
		
		arr2[0] = 1.0;
		arr2[1] = 2.0;
		arr2[2] = 3.0;
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr2 changed value : " + arr2[i]);
		}
		//문자열
		String[] arr3 = new String[3];
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3 default value : " + arr3[i]);
		}
		
		arr3[0] = "심개";
		arr3[1] = "영발";
		arr3[2] = "조자";
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3 changed value : " + arr3[i]);
		}
		
	}

}
