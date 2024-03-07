package ch06.sec10.exam01;

public class Calculator {
		static double pi = 3.14159;
		
		
		static int plus(int x, int y) { 
			//인스턴스 멤버를 호출또는 사용하지않는 경우에는 static을 붙인다.
			return x + y;
		}
		static int minus(int x, int y) { 
			//인스턴스 멤버를 호출또는 사용하지않는 경우에는 static을 붙인다.
			return x - y;
		}

}
