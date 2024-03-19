package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");//1번째로 들어갔던 문자열과 같은 리터럴이므로 동등객체라고 인식하게 된다.
		set.add(new String("Java"));
		set.add("Spring");
		
		
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
