package ch15.sec05.exam03;

public class Person implements Comparable <Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//만약 문자열 정렬 순서를 역순으로 바꾸고싶다면 result의 부호를 바꾸면 된다.
	@Override
	public int compareTo(Person o) {
		int result = this.name.compareTo(o.name);
		return result;
	}
}
