package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 19));
		treeSet.add(new Person("김길동", 20));
		treeSet.add(new Person("성길동", 30));
		
		System.out.println("treeSet에 들어간 요소 정렬");
		for(Person person : treeSet) {
			System.out.print(person.name + " ");
		}
		
		
	}

}
