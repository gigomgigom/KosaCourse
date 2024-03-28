package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		parent.method1(); 
		parent.method2(); //재정의한 것이 실행
		//parent.method3(); 같은 객체를 참조하지만 부모 클래스 타입 변수에서 자식 클래스에서 별도로 선언된 메소드를 호출할 수 없다.
		
		if(child==parent) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
	}

}
