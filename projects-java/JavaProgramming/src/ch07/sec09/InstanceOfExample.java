package ch07.sec09;

public class InstanceOfExample {
	
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student) { //이렇게 변수가 참조하는 객체의 원천 클래스를 확인할 수 있고
			Student student = (Student) person;
			System.out.println(student.studentNo);
			student.study();
		}
		if(person instanceof Student student) { //또는 이러한 방식으로 표현을 할 수 있다.
		//만약 조건식이 참이라면 person객체를 Student타입으로 변환해서 student참조변수에 대입한다. 
			System.out.println(student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personInfo(new Person("홍길동"));
		System.out.println();
		personInfo(new Student("흉길동", 20));
	}

}
