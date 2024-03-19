package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
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
		
		//저장된 객체의 수
		System.out.println("총 객체 수 : " + set.size());
		
		//하나씩 객체 가져오기
		for(String item : set) {
			System.out.println(item);
		}
		
		System.out.println();
		
		//하나씩 객체 가져오기 (방법2)
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
