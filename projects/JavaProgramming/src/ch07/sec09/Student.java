package ch07.sec09;

public class Student extends Person {
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name); //부모클래스 생성자
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
