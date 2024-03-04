package ch05.sltn;

public class Sltn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 3, 8, 2}; //문제에서 주어진 배열 객체를 참조하는 변수를 선언 및 초기화
		int max = 0; //최댓값을 담을 정수형 변수 max 선언 및 초기화
		
		for(int i = 0; i < array.length; i++) { //index값 0에서부터 4까지 반복한다.
			if(max < array[i]) { //i번 인덱스 안에 저장된 값과 지금까지 찾은 최댓값(max)와 비교한 후 우측 피연산자가 max보다 더 크다면
				max = array[i]; //max값에 i번 인덱스 값을 대입한다.
			}
		}
		System.out.println("최대값은 " + max);
	}

}
