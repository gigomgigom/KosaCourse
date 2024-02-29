package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 이렇게 작성하게 되면 v2변수가 if구문 안에서만 선언이 되어있어 if구문 밖의 명령어로 불러올 수 없다.
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5; //v2변수를 사용할 수 없으므로 컴파일 에러가 발생하게 된다.
		*/
		//이 컴파일 오류를 해결한 코드이다.
		int v1 = 15;
		int v2 = 0;
		
		if(v1>10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;
	}

}
