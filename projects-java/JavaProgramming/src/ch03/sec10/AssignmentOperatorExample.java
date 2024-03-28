package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0; //
		result += 10; //result값에 10을 더함 : 10
		System.out.println("result1 = " + result);
		result -= 5; //result값에 5를 뺌 : 5
		System.out.println("result2 = " + result);
		result *= 3; //result값에 3을 곱함 : 15
		System.out.println("result3 = " + result);
		result /= 5; //result값에 5를 나눔 : 3
		System.out.println("result4 = " + result);
		result %= 3; //result값에 3을 나눈 나머지값 : 0
		System.out.println("result5 = " + result);
	}

}
