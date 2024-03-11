package ch07.sec07.exam01;


class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		/* 이 두 경우에는 서로 상속관계가 없기 때문에 컴파일 에러가 발생하게 된다.
		B b2 = e;
		C c2 = d;
		*/
	}

}
