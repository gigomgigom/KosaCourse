package ch13.sec03.exam01;

public class GenericExample {
	public static <C> Box<C> boxing(C c) {
		Box<C> box = new Box<C>();
		box.setT(c);
		return box;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = boxing("abc");
		System.out.println(box1.getT());
		Box<Integer> box2 = boxing(100);
		System.out.println(box2.getT());

		
	}

}
