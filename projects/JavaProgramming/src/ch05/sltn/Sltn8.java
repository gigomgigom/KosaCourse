package ch05.sltn;

public class Sltn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이런 예제로 생각해보자
		//학교에는 3반으로 나눠져있고 1반은 2명의 학생 2반은 3명의 학생 그리고 3반은 5명의 학생이 있다.
		//전교생의 점수를 2차원 배열(array)로 입력을 했다.
		//전교생의 점수의 전체 합과 평균 점수를 구해서 출력해라
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; //전교생 성적을 합칠 sum 변수를 선언 및 초기화
		int totalStudent = 0; //평균을 계산하기 위해 전교생 인원 수를 저장할 변수를 선언 및 초기화
		
		for(int i = 0; i < array.length; i++) { //1차원 기준 0부터 (배열의 길이-1) 만큼 반복한다. 
			totalStudent += array[i].length; //2차원 기준 반별 학생의 성적 값의 갯수를 totalStudent값에 더하고 totalStudent 변수에 저장한다.
			for(int j = 0; j < array[i].length; j++) { //2차원 기준 0부터 (반별 학생 수 -1)만큼 반복한다.
				sum += array[i][j]; //2차원 기준 array[i][j]에 해당하는 값을 sum변수값에 더하고 결과를 sum변수에 저장한다.
			}
		}
		
		double avg = (double) sum / totalStudent; //평균 점수를 확인하기 위해 두 피연산자 중 하나를 double형식으로 강제 변환하여 소숫점 자리까지 표시되도록 한다.
		
		System.out.println("전체 점수 합 : " + sum);
		System.out.println("전교생 평균 : " + avg);
	}

}
