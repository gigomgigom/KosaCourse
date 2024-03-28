package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
		
		System.out.println(m1.equals(m2));
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		
		System.out.println("총 객체 수 : " + set.size());
		
	}

}
