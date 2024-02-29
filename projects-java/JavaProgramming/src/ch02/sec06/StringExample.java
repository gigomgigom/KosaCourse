package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		//만약 '자바' 단어를 강조하고 싶어서 자바를 큰따옴표로 감싸면 "나는 " 부분만 문자열로 컴파일러가 인식하고 그 뒤 문자열은 인식하지못한다.
		//정 큰따옴표를 사용하고 싶다면 문자열로 쓸 큰 따옴표 앞에 \(역슬래시)를 붙여서 문자열이라는 것을 컴파일러한테 알려줘야한다. (이스케이프 구문 참고) 역슬래쉬 이스케이프 구문 사용사례 (파일 경로 문자열
		System.out.println(str);
		
		str = "number\tname\tjob"; //number(t)name(t)job
		System.out.println(str);
		
		System.out.print("I\n"); //I(행바꿈)
		System.out.print("love\n"); //love(행바꿈)
		System.out.print("Java."); //Java
		
	}

}
