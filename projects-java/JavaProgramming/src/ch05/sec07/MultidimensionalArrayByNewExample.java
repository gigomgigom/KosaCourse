package ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int[][] scores1 = new int[2][3];
		//배열 항목 초기값 출력
		for(int i = 0; i < scores1.length; i++) {
			for(int j = 0; j < scores1[i].length; j++) {
				System.out.println("scores1["+i+"]["+j+"] : " + scores1[i][j]);
			}
		}
		System.out.println();
		//배열 항목 값 변경
		scores1[0][0] = 80;
		scores1[0][1] = 83;
		scores1[0][2] = 85;
		scores1[1][0] = 86;
		scores1[1][1] = 90;
		scores1[1][2] = 92;
		//전체 학생 수학 평균 구하기
		int sum1 = 0;
		int totalStudent1 = 0;
		for(int i = 0; i < scores1.length; i++) {
			totalStudent1 += scores1[i].length;
			for(int j = 0; j < scores1[i].length; j++) {
				sum1 += scores1[i][j];
			}
		}
		double avg1 = (double)sum1 / totalStudent1;
		
		System.out.println("전체 학생 1번 평균 : " + avg1);
		
		//각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성 2,3
		int[][] scores2 = new int[2][];
		scores2[0] = new int[2];
		scores2[1] = new int[3];
		//초기값 출력
		for(int i = 0; i<scores2.length; i++) {
			for(int j = 0; j<scores2[i].length; j++) {
				System.out.println("scores2["+i+"]["+j+"] : " + scores2[i][j]);
			}
		}
		//항목 값 변경
		scores2[0][0] = 90;
		scores2[0][1] = 91;
		scores2[1][0] = 92;
		scores2[1][1] = 93;
		scores2[1][2] = 94;
		//전체 학생의 평균 구하기
		int sum2 = 0;
		int totalStudent2 = 0;
		for(int i = 0; i < scores2.length; i++) {
			totalStudent2 += scores2[i].length;
			for(int j = 0; j < scores2[i].length; j++) {
				sum2 += scores2[i][j];
			}
		}
		double avg2 = (double)sum2 / totalStudent2;
		
		System.out.println("전체 학생 2번 평균 : " + avg2);
	}

}
