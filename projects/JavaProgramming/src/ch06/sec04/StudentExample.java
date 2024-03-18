package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s1;
		
		if(s1 == s2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체 ");
		}
	}

}