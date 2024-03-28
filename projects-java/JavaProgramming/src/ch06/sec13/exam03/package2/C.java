package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	// 필드 선언
	A a = new A();
	
	// 생성자 선언
	public C() {
		a.field1 = 1;
		//a.field2 = 1; // 같은 패키지 안에서만 사용가능한 default 
		//a.field3 = 1; // private 다른 패키지 사용 불가
		
		
		a.method1(); // public 
		//a.method2(); // default (x)
		//a.method3(); // private (x)
	}
	
	
	// 메소드 선언
	
	
}
