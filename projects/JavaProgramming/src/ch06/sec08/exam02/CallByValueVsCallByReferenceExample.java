package ch06.sec08.exam02;

public class CallByValueVsCallByReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 1;
		int[] value2 = {1};
		
		callByValue(value1);
		System.out.println("vlaue1: "+ value1);
		
		callByReference(value2);
		System.out.println("vlaue2: "+ value2[0]);
		
		callByReference(value2);
		System.out.println("vlaue2: "+ value2[0]);

		Member member = new Member("심영조");
		System.out.println("name: " + member.name);
		callByReference(member);
		System.out.println("name: " + member.name);
	}

	public static void callByValue(int arg) { //int arg = value1 과 같다
		arg = 2;
	}
	public static void callByReference(int[] arg) {
		arg[0] = 2;
	}
	public static void callByReference(Member arg) {
		arg.name = "감자바";
	}
	
	//CallByReference와 CallByValue의 차이 : 기본타입은 값복사가 이루어지고 참조타입은 번지복사가 이루어진다.
}
