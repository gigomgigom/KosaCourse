package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		
		strArray[0] = "자바";
		strArray[1] = "자바";
		strArray[2] = new String("자바"); //위 두 문자열과 같은 리터럴을 갖는 또다른 문자열 객체를 생성한다.
		
		System.out.println( strArray[0] == strArray[1] ); //같은 리터럴일 경우 문자열 객체를 공유한다.
		System.out.println( strArray[1] == strArray[2] ); //new연산자로 생성된 엄연한 다른 객체이므로 false가 나오게된다.
		System.out.println( strArray[2].equals(strArray[1])); 
	}

}
