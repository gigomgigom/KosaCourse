package ch05.sec05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		
		for(int i = 0; i < season.length; i++) {
			System.out.println(season[i]);
		}
		
		season[1] = "여름";
		System.out.println("season[1]: "+season[1]);
		System.out.println();
		
		int[] scores = {89, 56, 55};
		
		int sum = 0;
		
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		double average = (double)sum / 3;
		
		System.out.println("총합:" + sum);
		
		System.out.println("평균: " + average);
	}

}
