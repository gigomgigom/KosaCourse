package ch13.sec05;

public class Course {
	
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}
	
	//Student나 또는 Student를 상속받는 자식 클래스 타입으로 지정할 수 있다.
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");
	}
	//Worker나 또는 Worker의 상위 클래스들의 타입으로 지정할 수 있다.
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}
