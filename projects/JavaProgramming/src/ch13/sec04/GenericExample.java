package ch13.sec04;

public class GenericExample {

	
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		System.out.println("Compare (" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		//t1과 t2 매개변수의 설정된 타입(클래스 명)을 확인하기 위한 코드
		
		//매개변수로 받아온 박싱된 객체들을 다시 기본타입으로 반환
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		//v1과 v2의 값이 같은지 비교
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result1 = compare(10, 20); //매개변수로 갈때 참조타입으로 값이 전달되야하므로 박싱되어 객체화 된 후에 전달이 됨
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5); //매개변수로 갈때 참조타입으로 값이 전달되야하므로 박싱되어 객체화 된 후에 전달이 됨
		
		System.out.println(result2);
	}

}
