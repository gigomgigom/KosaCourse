package ch05.sec04;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1, strVar2 have same reference");
		} else {
			System.out.println("strVar2, strvar2 have different reference");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2 have same data");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3 and strVar4 have same reference");
		} else {
			System.out.println("strVar3 and strVar4 have different reference");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3 and strVar4 have same data");
		}
	}

}
