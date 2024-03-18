package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course.registerCourse1(new Applicant<Person>(new Person()));
		//제너릭타입을 Person으로 지정하고 생성자에 받아오는 매개값을 Person객체로 참조한다.
		//모든 타입이 들어올 수 있으니 아래와 같이 나열해도 상관없다.
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		//Student또는 Student를 상속받는 자식 클래스 타입으로 지정할 수 있다. 그외는 오류가 발생함
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		//Worker또는 Worker의 상위 클래스 타입으로 지정할 수 있다. 그외에는 오류가 발생함.
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
	}

}
