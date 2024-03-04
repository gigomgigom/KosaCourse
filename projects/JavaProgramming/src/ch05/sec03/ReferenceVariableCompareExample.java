package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1; //배열 참조타입 변수선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; //arr1, arr2 변수에 새로운 배열 참조를 생성하며 같은 값을 저장한다.
		arr2 = new int[] {1, 2, 3}; //각자 새로운 객체를 생성했으므로 서로 객체 참조 번지수가 다르게 된다.
		arr3 = arr2;				//arr3 변수에 arr2 변수의 번지수를 대입한다.(대신 타입이 같아야함.)
		
		System.out.println("arr1 == arr2 : " + (arr1 == arr2)); //arr1과 arr2의 객체 참조 번지수가 같은가? false
		System.out.println("arr2 == arr3 : " + (arr2 == arr3)); //arr2와 arr3의 객체 참조 번지수가 같은가? true
	}

}
