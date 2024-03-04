package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		char grade = (score >90) ? 'A' : ((score > 80) ? 'B' : 'C');
		//첫번째 경우 score가 90보다 큰가? true-> 'A'
		//2번째 경우 score가 90보다 큰가? false-> (score>80) ? 'B' : 'C' score가 80보다 큰가? -> (true: B), (false : C)
		System.out.println(grade);
	}

}
